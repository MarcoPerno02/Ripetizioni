const images = [
    "static/aereo.png",
    "static/cane.png",
    "static/pizza.png",
    "static/bici.png"
];

let cardsArray = [];
let flippedCards = [];
let lockBoard = false;
let moves = 0;
let matchedPairs = 0;

const gameBoard = document.getElementById("game");
const info = document.getElementById("info");
const restartBtn = document.getElementById("restart");

function initGame() {
    moves = 0;
    matchedPairs = 0;
    info.textContent = "Mosse: 0";
    gameBoard.innerHTML = "";
    cardsArray = [...images, ...images]; // 2 copie per immagine
    shuffle(cardsArray);

    cardsArray.forEach(src => {
    const card = document.createElement("div");
    card.classList.add("card");
    card.innerHTML = `
        <div class="card-inner">
        <div class="card-front">?</div>
        <div class="card-back"><img src="${src}" alt=""></div>
        </div>
    `;
    card.addEventListener("click", () => flipCard(card, src));
    gameBoard.appendChild(card);
    });
}

function shuffle(array) {
    for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
    }
}

function flipCard(card, src) {
    if (lockBoard || card.classList.contains("flipped")) return;

    card.classList.add("flipped");
    flippedCards.push({ card, src });

    if (flippedCards.length === 2) {
    moves++;
    info.textContent = `Mosse: ${moves}`;
    checkMatch();
    }
}

function checkMatch() {
    const [first, second] = flippedCards;
    if (first.src === second.src) {
    matchedPairs++;
    flippedCards = [];
    if (matchedPairs === images.length) {
        setTimeout(() => alert(`Hai vinto in ${moves} mosse! 🏆`), 500);
    }
    } else {
    lockBoard = true;
    setTimeout(() => {
        first.card.classList.remove("flipped");
        second.card.classList.remove("flipped");
        flippedCards = [];
        lockBoard = false;
    }, 1000);
    }
}

restartBtn.addEventListener("click", initGame);

initGame();
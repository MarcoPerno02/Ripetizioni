// LABIRINTO: 0 = muro, 1 = percorso, 2 = giocatore, 3 = uscita
let maze = [
    [0, 2, 1, 1, 1],
    [1, 1, 0, 1, 0],
    [1, 0, 0, 1, 1],
    [1, 1, 1, 1, 0],
    [1, 0, 1, 3, 1]
];

let playerRow = 0;
let playerCol = 1;
let moves = 0;

const mazeDiv = document.getElementById("maze");
const statusDiv = document.getElementById("status");

function renderMaze() {
    mazeDiv.innerHTML = "";
    for (let r = 0; r < maze.length; r++) {
        for (let c = 0; c < maze[r].length; c++) {
            const cell = document.createElement("div");
            if (maze[r][c] === 0) cell.className = "cell-wall";
            else if (maze[r][c] === 1) cell.className = "cell-path";
            else if (maze[r][c] === 2) cell.className = "cell-player";
            else if (maze[r][c] === 3) cell.className = "cell-exit";
            mazeDiv.appendChild(cell);
        }
    }
}

function movePlayer(dr, dc) {
    const newRow = playerRow + dr;
    const newCol = playerCol + dc;
    if (newRow < 0 || newRow >= maze.length || newCol < 0 || newCol >= maze[0].length) return;
    if (maze[newRow][newCol] === 0) return; // muro

    // muovi giocatore
    maze[playerRow][playerCol] = 1;
    playerRow = newRow;
    playerCol = newCol;
    if (maze[playerRow][playerCol] === 3) {
        statusDiv.textContent = `Hai vinto in ${moves + 1} mosse!`;
    } else {
        maze[playerRow][playerCol] = 2;
        moves++;
        statusDiv.textContent = `Mosse: ${moves} - In corso`;
    }
    renderMaze();
}

document.addEventListener("keydown", function (e) {
    if (statusDiv.textContent.includes("Hai vinto")) return;
    if (e.key === "ArrowUp") movePlayer(-1, 0);
    else if (e.key === "ArrowDown") movePlayer(1, 0);
    else if (e.key === "ArrowLeft") movePlayer(0, -1);
    else if (e.key === "ArrowRight") movePlayer(0, 1);
});

document.getElementById("resetBtn").addEventListener("click", function () {
    maze = [
        [0, 2, 1, 1, 1],
        [1, 1, 0, 1, 0],
        [1, 0, 0, 1, 1],
        [1, 1, 1, 1, 0],
        [1, 0, 1, 3, 1]
    ];
    playerRow = 0;
    playerCol = 1;
    moves = 0;
    statusDiv.textContent = "Mosse: 0 - In corso";
    renderMaze();
});

renderMaze();
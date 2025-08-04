# 🖼️ ESERCIZIO: Galleria di Immagini Interattiva

## DESCRIZIONE  
Crea una **pagina web con una galleria di immagini**, in cui l’utente può **navigare**, **ingrandire** e **filtrare** le immagini in modo dinamico.

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (HTML):
- Una sezione `div.gallery` che contiene le miniature cliccabili delle immagini
- Un contenitore `div#viewer` che mostra l’immagine selezionata in grande
- Due bottoni `←` e `→` per navigare avanti e indietro
- Un filtro (input di testo o `select`) per filtrare le immagini per categoria

---

## 2. FUNZIONALITÀ JAVASCRIPT:
- Quando l’utente clicca su una miniatura:
  - L’immagine viene visualizzata nel `viewer`
  - L’immagine selezionata è evidenziata
- I bottoni `←` e `→`:
  - Cambiano immagine nel viewer
  - Supportano scorrimento circolare (dopo l’ultima torna alla prima)
- Il filtro mostra solo le immagini della categoria inserita o selezionata
- Eventi gestiti tramite `addEventListener`

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `imageList` → array di percorsi immagine (es: ["img1.jpg", "img2.jpg", ...])
- `categoryList` → array parallelo con categorie (es: ["natura", "città", ...])
- `currentIndex` → indice dell’immagine attualmente mostrata
- `currentFilter` → categoria corrente selezionata o scritta

### FUNZIONI PRINCIPALI
- `renderGallery()`  
  ↳ Mostra tutte le miniature delle immagini filtrate

- `showImage(index)`  
  ↳ Mostra nel viewer l’immagine corrispondente all’indice

- `nextImage()` / `prevImage()`  
  ↳ Incrementa o decrementa l’indice con effetto circolare

- `applyFilter()`  
  ↳ Mostra solo le immagini che corrispondono alla categoria scelta

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se non ci sono immagini nella categoria filtrata → mostra messaggio "Nessuna immagine trovata"
- Navigazione circolare: avanti dopo l’ultima → torna alla prima, e viceversa
- Nessuna immagine selezionata all’avvio → viewer vuoto o nascosto

---

## 💡 ESEMPIO DI STRUTTURA HTML
```
+------------------------------------------------+
| [ Natura ] ⌄ | ← Filtro
+------------------------------------------------+
| 🖼️ | 🖼️ | 🖼️ | 🖼️ | 🖼️ ← Miniature gallery
+------------------------------------------------+
| ← [ IMMAGINE GRANDE ] → | ← Viewer con navigazione
+------------------------------------------------+
```


---

## ✨ BONUS (FACOLTATIVO)

- Salvataggio dell’ultima immagine selezionata in `localStorage`
- Modal a schermo intero cliccando sull’immagine grande
- Aggiunta del supporto al drag (mouse) o swipe (touch)
- Transizioni animate tra le immagini


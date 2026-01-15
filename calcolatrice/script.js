// Prende l'elemento HTML con id="display" (dove vengono mostrati i numeri)
const display = document.getElementById("display");

// Prende il contenitore che contiene tutti i pulsanti della calcolatrice
const buttons = document.getElementById("buttons");

// Variabile che contiene l'espressione matematica digitata dall'utente
let current = "";

// Aggiunge un ascoltatore di eventi per intercettare i click su QUALSIASI pulsante
buttons.addEventListener("click", (e) => {

  // Legge il valore del pulsante cliccato tramite l'attributo data-value
  const value = e.target.dataset.value;

  // Se il click non proviene da un pulsante valido, interrompe la funzione
  if (!value) return;

  // --- GESTIONE DEL TASTO "C" (CANCELLA TUTTO) ---
  if (value === "C") {
    // Svuota completamente l'espressione
    current = "";
    // Mostra 0 sul display
    display.textContent = "0";
    // Esce dalla funzione perché non deve fare altro
    return;
  }

  // --- GESTIONE DEL TASTO "=" (CALCOLO RISULTATO) ---
  if (value === "=") {
    try {
      // Sostituisce la virgola con il punto perché eval accetta solo il punto
      const expression = current.replace(",", ".");
      // Esegue l'espressione matematica
      const result = eval(expression);
      // Mostra il risultato, riconvertendo il punto in virgola
      display.textContent = result.toString().replace(".", ",");
      // Aggiorna current con il risultato per continuare a calcolare
      current = result.toString();
    } catch {
      // Se eval fallisce (espressione non valida), mostra un errore
      display.textContent = "Errore";
    }
    // Esce dalla funzione
    return;
  }

  // --- CONTROLLO DELLA VIRGOLA ---
  if (value === ",") {
    // Prende l'ultimo numero digitato (dopo l'ultimo operatore)
    const lastNumber = current.split(/[\+\-\*\/]/).pop();
    // Se quel numero contiene già una virgola, blocca l'inserimento
    if (lastNumber.includes(",")) return;
  }

  // --- CONTROLLO DELLO ZERO ---
  // Prende l'ultimo carattere dell'espressione (può essere utile per controlli)
  const lastChar = current.slice(-1);

  // Prende l'ultimo numero digitato (come sopra)
  const lastNumber = current.split(/[\+\-\*\/]/).pop();

  if (value === "0") {
    // Se l'ultimo numero è già "0", impedisce di scrivere "00"
    if (lastNumber === "0") return;

    // Se l'espressione finisce con operatore + "0", impedisce "+00", "*00", ecc.
    if (/[\+\-\*\/]0$/.test(current)) return;
  }

  // --- SE TUTTI I CONTROLLI SONO SUPERATI, AGGIUNGE IL VALORE ---
  current += value;

  // Aggiorna il display con l'espressione completa
  display.textContent = current;
});

# Calcolatrice Web 

## Obiettivo
Realizzare un'applicazione web funzionante che simuli una calcolatrice di base, strutturando l'interfaccia in HTML e implementando la logica di calcolo e di controllo degli input tramite JavaScript[cite: 46, 47].

## Struttura HTML
Il documento HTML dovrà definire la struttura visiva dell'applicazione[cite: 46].
* **Elementi richiesti:**
  * Un elemento `div` (con `id="display"`) adibito a mostrare i numeri, inizializzato con il valore "0"[cite: 46].
  * Un elemento `div` contenitore (con `id="buttons"`) che racchiuda tutti i tasti della calcolatrice[cite: 46].
  * All'interno del contenitore, creare elementi `button` per i numeri da 0 a 9, per gli operatori matematici (`/`, `*`, `-`, `+`), per la virgola (`,`), per il reset (`C`) e per il risultato (`=`)[cite: 46].
* **Attributi dati:** Ogni pulsante dovrà essere dotato di un attributo personalizzato `data-value` contenente il valore esatto associato al tasto (es. `data-value="7"` o `data-value="+"`)[cite: 46].
* **Collegamento JS:** Collegare il file JavaScript esterno in fondo al documento[cite: 46].

## Logica JavaScript
Il file JavaScript dovrà gestire il comportamento dell'interfaccia e validare gli input dell'utente[cite: 47].
* **Inizializzazione:**
  * Selezionare e memorizzare in variabili gli elementi HTML del display e del contenitore dei pulsanti tramite i loro ID[cite: 47].
  * Creare una variabile stringa (ad esempio `current`) per memorizzare l'espressione matematica via via digitata[cite: 47].
* **Gestione Eventi (Event Delegation):**
  * Aggiungere un singolo `addEventListener` al contenitore generale dei pulsanti per intercettare tutti i click[cite: 47].
  * All'interno dell'evento, recuperare il valore cliccato leggendo l'attributo `data-value` del target; se il click avviene in uno spazio vuoto (valore inesistente), interrompere la funzione[cite: 47].
* **Logiche di Controllo e Operazioni:**
  * **Tasto "C":** Svuotare la stringa dell'espressione e mostrare "0" sul display[cite: 47].
  * **Tasto "=":** Sostituire la virgola con il punto per rendere l'espressione compatibile con il calcolo, eseguire l'espressione tramite la funzione `eval()`, riconvertire il punto del risultato in virgola per la visualizzazione e aggiornare sia il display che la variabile in memoria[cite: 47]. Prevedere un blocco `try-catch` per catturare eventuali espressioni non valide e stampare "Errore"[cite: 47].
  * **Controllo della Virgola (`,`):** Isolare l'ultimo numero digitato (dividendolo in base agli operatori) e bloccare l'inserimento qualora il numero contenga già una virgola[cite: 47].
  * **Controllo dello Zero (`0`):** Isolare l'ultimo numero e bloccare l'inserimento dello zero se questo comporterebbe la scrittura di zeri consecutivi non validi all'inizio di una cifra (ad esempio "00" o dopo un operatore come "+00")[cite: 47].
  * **Aggiornamento:** Se tutti i controlli vengono superati, concatenare il valore del pulsante all'espressione corrente e aggiornare il testo mostrato nel display[cite: 47].
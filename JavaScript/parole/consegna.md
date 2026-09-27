# Progetto Applicazione Web: Tabella Parole Dinamica

## Obiettivo Principale
Creare un progetto di un'applicazione web che presenti all'utente una tabella interattiva. All'interno del documento HTML dovrà esserci una griglia (minimo 5x5) e in ogni cella andrà inserita una parola a caso.

## Requisiti Tecnici Obbligatori

*   **Manipolazione del DOM:** La tabella deve essere generata, popolata e manipolata esclusivamente tramite JavaScript. Non deve essere scritta direttamente nell'HTML.
*   **Interattività e Composizione:** Al click su una singola cella, la parola contenuta deve essere aggiunta a una frase (che verrà visualizzata in un elemento subito sotto la tabella). Le parole si aggiungeranno l'una dopo l'altra.
*   **Formattazione Testo:** Fra una parola aggiunta e la successiva deve essere presente uno spazio vuoto.
*   **Gestione degli Eventi (Best Practices):** È richiesto l'uso esclusivo di `addEventListener`. Nello specifico, deve essere associato sia per il caricamento iniziale del documento (`DOMContentLoaded`), sia per gestire i click sulle singole celle della tabella.

## Funzionalità Extra Facoltativa

*   **Pulsante Cancella:** Prevedere la possibilità di rimuovere l'ultima parola aggiunta al paragrafo. 
    *   *Vincolo:* Il sistema deve permettere di cancellare **soltanto** l'ultima parola immessa correntemente, impedendo di cancellare la parola precedente e quella prima ancora.
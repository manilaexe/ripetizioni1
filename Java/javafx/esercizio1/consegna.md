# Prima Applicazione Grafica con JavaFX

## Obiettivo
Creare una classe principale `Main` che avvii una semplice applicazione con interfaccia grafica (GUI) utilizzando la libreria JavaFX. Il programma dovrà interagire con l'utente acquisendo un input testuale e restituendo un messaggio a schermo.

## Requisiti dell'Interfaccia Grafica
La finestra dell'applicazione dovrà essere strutturata e organizzata in modo ordinato, includendo i seguenti elementi visivi:
* una scritta iniziale;
* un campo di testo dove l'utente possa inserire il proprio nome;
* un pulsante di conferma.
* **Layout:** L'interfaccia dovrà essere organizzata utilizzando un opportuno layout JavaFX a scelta tra `VBox`, `HBox` o `GridPane`.
* **Finestra:** Impostare un titolo personalizzato per la finestra e definire una dimensione iniziale adeguata.

## Logica e Funzionamento
Quando l'utente preme il pulsante, il programma dovrà eseguire un'azione specifica:
1. Leggere il testo inserito all'interno del campo di testo.
2. Modificare la scritta iniziale per mostrare un messaggio di saluto personalizzato. 
*(Ad esempio: se l'utente inserisce "Mario" e preme il pulsante, la finestra dovrà aggiornare la scritta in "Ciao Mario!").*

## Componenti Minimi Richiesti
Il codice sorgente del programma dovrà utilizzare e implementare obbligatoriamente i seguenti componenti JavaFX:
* una classe principale che estenda la classe `Application`;
* l'override del metodo `start(Stage stage)`;
* un oggetto `Stage` (finestra principale);
* un oggetto `Scene` (contenitore degli elementi grafici);
* una `Label` (per la scritta iniziale e il saluto finale);
* una `TextField` (per l'inserimento del nome);
* un `Button` (per innescare l'azione);
* un evento associato al click sul pulsante tramite il metodo `setOnAction()`.

## Programma Principale (Main)
All'interno della classe principale, definire il classico metodo `main` nel quale dovrà essere avviata l'applicazione JavaFX richiamando esclusivamente l'istruzione:
`launch(args);`
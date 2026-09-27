const dizionario = ["mela", "sole", "gatto", "corre", "veloce", "casa", "albero", "bello", "cane", "dorme", "mare", "blu", "cielo", "rosso", "libro", "legge", "tavolo", "sedia", "grande", "piccolo", "amico", "salta", "ride", "piange", "oggi", "domani", "fuoco", "acqua"];

document.addEventListener('DOMContentLoaded', function() {

    // Seleziono gli elementi dell'html
    const contenitore = document.getElementById('contenitore-tabella');
    const paragrafoFrase = document.getElementById('frase-composta');

    // --- INIZIO PARTE EXTRA ---
    // Creo un bottone tramite JavaScript per cancellare l'ultima parola
    const btnCancella = document.createElement('button');
    btnCancella.textContent = "Cancella ultima parola";
    btnCancella.disabled = true; // Lo disabilito all'inizio perché la frase è vuota
    
    // Inserisco il bottone nel DOM, subito dopo il paragrafo della frase
    paragrafoFrase.parentNode.insertBefore(btnCancella, paragrafoFrase.nextSibling);

    // Questa variabile ("flag") ci assicura che l'utente possa cancellare
    // SOLO l'ultima parola e non quelle precedenti.
    let puoCancellare = false;

    // Aggiungo l'Event Listener al click sul bottone
    btnCancella.addEventListener('click', function() {
        if (puoCancellare) {
            // Prendo la frase attuale e la divido in un array di parole (usando lo spazio come separatore)
            let parole = paragrafoFrase.textContent.split(" ");
            
            // Rimuovo l'ultimo elemento dell'array
            parole.pop();
            
            // Ricompongo la stringa unendo le parole rimaste con uno spazio e aggiorno il paragrafo
            paragrafoFrase.textContent = parole.join(" ");
            
            // Impedisco di cancellare "quella prima e quella prima ancora"
            puoCancellare = false;
            btnCancella.disabled = true;
        }
    });
    // --- FINE PARTE EXTRA ---

    // Creo l'elemento per la tabella 
    const tabella = document.createElement('table');

    // Ciclo per creare la tabella 
    for (let i = 0; i < 5; i++) {   
        const riga = document.createElement('tr');
        for (let j = 0; j < 5; j++) {
            const cella = document.createElement('td');
            
            // Numero casuale per selezionare dal dizionario 
            const indiceCasuale = Math.floor(Math.random() * dizionario.length);
            const parolaCasuale = dizionario[indiceCasuale];
            
            // Inserisco la parola nella cella 
            cella.textContent = parolaCasuale;
            
            cella.addEventListener('click', function() {
                if (paragrafoFrase.textContent === "") {
                    paragrafoFrase.textContent = cella.textContent;
                } else {
                    paragrafoFrase.textContent += " " + cella.textContent;
                } 
                // EXTRA: Ogni volta che aggiungo una parola, riabilito la possibilità di cancellare
                puoCancellare = true;
                btnCancella.disabled = false;
            });   
            // Append della cella alla riga
            riga.appendChild(cella);
        }
        // Append della riga alla tabella 
        tabella.appendChild(riga);
    }
    contenitore.appendChild(tabella);
});
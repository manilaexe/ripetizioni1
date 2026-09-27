const dizionario = ["mela", "sole", "gatto", "corre", "veloce", "casa", "albero", "bello", "cane", "dorme", "mare", "blu", "cielo", "rosso", "libro", "legge", "tavolo", "sedia", "grande", "piccolo", "amico", "salta", "ride", "piange", "oggi", "domani", "fuoco", "acqua"];

// associo un event listener al dom 
document.addEventListener('DOMContentLoaded', function() {

    // Seleziono gli elementi dell'html
    const contenitore = document.getElementById('contenitore-tabella');
    const paragrafoFrase = document.getElementById('frase-composta');

    // Creo l'elemento per la tabella 
    const tabella = document.createElement('table');

    // ciclo per fare la tabella 
    for (let i = 0; i < 5; i++) {   
        const riga = document.createElement('tr');
        for (let j = 0; j < 5; j++) {
            const cella = document.createElement('td');
            // numero casuale per selezionare dal dizionario 
            const indiceCasuale = Math.floor(Math.random() * dizionario.length);
            const parolaCasuale = dizionario[indiceCasuale];
            
            // inserisco nella cella 
            cella.textContent = parolaCasuale;
            
            cella.addEventListener('click', function() {
                if (paragrafoFrase.textContent === "") {
                    paragrafoFrase.textContent = cella.textContent;
                } else {
                    paragrafoFrase.textContent += " " + cella.textContent; // sovrascrivo
                }
            });
            // append della cella alla riga
            riga.appendChild(cella);
        }
        
        // append della riga alla tabella 
        tabella.appendChild(riga);
    }
    contenitore.appendChild(tabella);
});
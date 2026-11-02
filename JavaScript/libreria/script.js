async function searchBooks() { /* Definisce una funzione asincrona per gestire la ricerca senza bloccare la pagina */
    const title = document.getElementById('titleInput').value.trim(); /* Recupera il testo del titolo e rimuove gli spazi vuoti iniziali/finali */
    const author = document.getElementById('authorInput').value.trim(); /* Recupera il testo dell'autore e rimuove gli spazi vuoti */
    const subject = document.getElementById('subjectInput').value.trim(); /* Recupera il testo dell'argomento e rimuove gli spazi vuoti */
    const resultsContainer = document.getElementById('results'); /* Seleziona il div in cui stampare i risultati per usarlo dopo */
    const loader = document.getElementById('loader'); /* Seleziona l'elemento di caricamento per poterlo mostrare/nascondere */

    if (!title && !author && !subject) { /* Controlla se l'utente ha lasciato tutti i campi vuoti */
        alert("Inserisci almeno un parametro di ricerca (Titolo, Autore o Argomento)."); /* Mostra un avviso se nessun campo è compilato */
        return; /* Interrompe immediatamente la funzione per evitare chiamate API inutili */
    } /* Chiude il blocco if di validazione */

    resultsContainer.innerHTML = ''; /* Svuota il contenitore dai risultati di eventuali ricerche precedenti */
    loader.style.display = 'block'; /* Rende visibile il messaggio "Caricamento in corso..." */

    const queryParams = new URLSearchParams(); /* Crea un oggetto per costruire in modo sicuro la query string dell'URL */
    if (title) queryParams.append('title', title); /* Se il titolo è stato inserito, lo aggiunge ai parametri dell'API */
    if (author) queryParams.append('author', author); /* Se l'autore è stato inserito, lo aggiunge ai parametri dell'API */
    if (subject) queryParams.append('subject', subject); /* Se l'argomento è stato inserito, lo aggiunge ai parametri dell'API */

    const url = `https://openlibrary.org/search.json?${queryParams.toString()}`; /* Costruisce l'URL completo concatenando l'endpoint di base con i parametri */

    try { /* Inizia un blocco try-catch per gestire possibili errori di rete durante la chiamata API */
        const response = await fetch(url); /* Esegue la chiamata HTTP di tipo GET e attende la risposta del server */
        const data = await response.json(); /* Attende la decodifica del corpo della risposta in un oggetto JavaScript (JSON) */
        
        loader.style.display = 'none'; /* Nasconde il messaggio di caricamento dato che i dati sono arrivati */

        if (data.docs.length === 0) { /* Controlla se l'array dei documenti trovati è vuoto */
            resultsContainer.innerHTML = '<p>Nessun libro trovato con questi criteri.</p>'; /* Mostra un messaggio all'utente se la ricerca non produce risultati */
            return; /* Interrompe l'esecuzione successiva della funzione */
        } /* Chiude il blocco if dei risultati vuoti */

        data.docs.forEach(book => { /* Avvia un ciclo su ogni singolo libro contenuto nell'array dei risultati */
            const card = document.createElement('div'); /* Crea dinamicamente un nuovo elemento div per la scheda */
            card.className = 'card'; /* Assegna la classe CSS 'card' al nuovo div per applicargli gli stili */

            let coverUrl = 'https://via.placeholder.com/80x120?text=No+Cover'; /* Imposta un'immagine segnaposto di default nel caso il libro non abbia copertina */
            if (book.cover_edition_key) { /* Controlla se l'API ha restituito un Open Library ID specifico per l'edizione (copertina) */
                coverUrl = `https://covers.openlibrary.org/b/olid/${book.cover_edition_key}-M.jpg`; /* Se esiste l'OLID, scarica la copertina di taglia Media (-M) tramite OLID */
            } else if (book.cover_i) { /* Alternativa: se non c'è l'OLID, controlla se c'è un ID interno per la copertina */
                coverUrl = `https://covers.openlibrary.org/b/id/${book.cover_i}-M.jpg`; /* Se c'è l'ID numerico, usa l'endpoint ID per generare l'immagine */
            } /* Chiude la logica per trovare l'immagine corretta */

            const titleText = book.title || 'Titolo sconosciuto'; /* Estrae il titolo o usa una stringa di fallback se mancante */
            const authorText = book.author_name ? book.author_name.join(', ') : 'Autore sconosciuto'; /* Unisce i nomi degli autori con virgole o gestisce la mancanza del dato */
            const yearText = book.first_publish_year || 'N/D'; /* Preleva l'anno di prima pubblicazione o mostra "N/D" (Non Disponibile) */
            const editionCount = book.edition_count || 0; /* Preleva il numero di edizioni esistenti, impostando 0 come default */
            
            card.innerHTML = ` <!-- Usa template literals per inserire dinamicamente la struttura HTML e le variabili nella scheda -->
                <img src="${coverUrl}" alt="Copertina di ${titleText}" loading="lazy"> <!-- Crea il tag immagine, imposta l'alt per l'accessibilità e usa loading lazy per performance -->
                <div class="card-info"> <!-- Apre il contenitore per i testi della scheda -->
                    <h3>${titleText}</h3> <!-- Inserisce il titolo all'interno di un tag h3 -->
                    <p><strong>Autore:</strong> ${authorText}</p> <!-- Inserisce l'autore in un paragrafo evidenziando l'etichetta -->
                    <p><strong>Prima pubblicazione:</strong> ${yearText}</p> <!-- Inserisce l'anno di prima pubblicazione -->
                    <p><strong>Numero edizioni:</strong> ${editionCount}</p> <!-- Inserisce il conteggio totale delle edizioni del libro -->
                </div> <!-- Chiude il contenitore dei testi -->
            `; /* Chiude l'assegnazione dell'HTML interno alla scheda */

            resultsContainer.appendChild(card); /* Aggiunge fisicamente la scheda appena costruita all'interno del contenitore nel DOM della pagina */
        }); /* Chiude il ciclo forEach sui libri */

    } catch (error) { /* Intercetta eventuali errori, ad esempio se non c'è connessione a internet */
        loader.style.display = 'none'; /* Nasconde comunque il loader visto che la richiesta è terminata, anche se fallita */
        resultsContainer.innerHTML = '<p style="color:red;">Si è verificato un errore durante la ricerca.</p>'; /* Stampa un messaggio d'errore colorato di rosso nel contenitore */
        console.error("Errore API:", error); /* Stampa i dettagli tecnici dell'errore nella console per facilitare il debugging */
    } /* Chiude il blocco catch */
} /* Chiude la definizione della funzione searchBooks */
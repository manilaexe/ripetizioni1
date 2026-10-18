<?php
// Riutilizzo la classe creata al punto 1 (nella realtà potresti usare un require_once 'punto1.php', ma qui la riscrivo per avere file indipendenti come richiesto)
class Calciatore {
    public $nomeCalciatore; // Dichiaro la proprietà nome
    public $numeroMaglia;   // Dichiaro la proprietà numero
    public $squadra;        // Dichiaro la proprietà squadra
    public $ruolo;          // Dichiaro la proprietà ruolo
    public $figurina;       // Dichiaro la proprietà figurina

    // Costruttore per inizializzare i dati dell'oggetto
    public function __construct($nome, $numero, $squadra, $ruolo, $immagine) {
        $this->nomeCalciatore = $nome; // Assegnazione nome
        $this->numeroMaglia = $numero; // Assegnazione numero
        $this->squadra = $squadra;     // Assegnazione squadra
        $this->ruolo = $ruolo;         // Assegnazione ruolo
        $this->figurina = $immagine;   // Assegnazione immagine
    }

    // Funzione richiesta per automatizzare il controllo del ruolo e restituire la classe CSS corretta
    public function getClasseCssRuolo() {
        // Converto il ruolo in minuscolo per evitare errori di battitura (es. 'Portiere' diventa 'portiere')
        $ruoloFormattato = strtolower($this->ruolo);
        
        // Se il ruolo è attaccante, ritorno la stringa 'attaccante' (che corrisponde alla classe CSS)
        if ($ruoloFormattato == 'attaccante') {
            return 'attaccante';
        } 
        // Altrimenti se è difensore, ritorno 'difensore'
        elseif ($ruoloFormattato == 'difensore') {
            return 'difensore';
        } 
        // Altrimenti se è portiere, ritorno 'portiere'
        elseif ($ruoloFormattato == 'portiere') {
            return 'portiere';
        } 
        // Se non è nessuno dei tre, ritorno una stringa vuota di default
        else {
            return '';
        }
    }

    // Metodo per stampare la presentazione con il ruolo colorato (Punto 2)
    public function stampaPresentazioneColorata() {
        // Richiamo la funzione interna per farmi restituire il nome della classe CSS in base al ruolo
        $classeCss = $this->getClasseCssRuolo();
        
        // Stampo l'intestazione
        echo "<h3>Il giocatore " . $this->nomeCalciatore . "</h3>";
        
        // Stampo il paragrafo. Nota l'uso del tag <span> con la classe PHP automatizzata all'interno dell'attributo class
        echo "<p>Nella squadra " . $this->squadra . " gioca " . $this->nomeCalciatore . " con numero di maglia " . $this->numeroMaglia . " e il suo ruolo è <span class='" . $classeCss . "'>" . $this->ruolo . "</span>.</p>";
    }
}

// Inizio il documento HTML, includendo il collegamento al file CSS esterno creato prima
echo "<!DOCTYPE html><html><head><title>Punto 2</title><link rel='stylesheet' type='text/css' href='style.css'></head><body>";

// Dichiaro e creo un array vuoto che conterrà i miei 5 giocatori
$listaGiocatori = array();
$listaGiocatori[] = new Calciatore("Mattia Perin", 1, "Juventus", "portiere", "https://placehold.co/150x150/000000/FFFFFF/png?text=Perin");
$listaGiocatori[] = new Calciatore("Michele Di Gregorio", 29, "Juventus", "portiere", "https://placehold.co/150x150/000000/FFFFFF/png?text=Di+Gregorio");
$listaGiocatori[] = new Calciatore("Carlo Pinsoglio", 23, "Juventus", "portiere", "https://placehold.co/150x150/000000/FFFFFF/png?text=Pinsoglio");
$listaGiocatori[] = new Calciatore("Dusan Vlahovic", 9, "Juventus", "attaccante", "https://placehold.co/150x150/000000/FFFFFF/png?text=Vlahovic");
$listaGiocatori[] = new Calciatore("Gleison Bremer", 3, "Juventus", "difensore", "https://placehold.co/150x150/000000/FFFFFF/png?text=Bremer");
// Utilizzo un ciclo foreach per navigare interamente l'array $listaGiocatori
foreach ($listaGiocatori as $singoloGiocatore) {
    // Per ogni giocatore trovato nell'array, chiamo il suo metodo di stampa colorata
    $singoloGiocatore->stampaPresentazioneColorata();
    // Aggiungo una linea di separazione HTML per dividere visivamente i giocatori
    echo "<hr>";
}

// Chiudo il documento HTML
echo "</body></html>";
?>
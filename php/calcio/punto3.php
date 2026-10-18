<?php
// Riutilizzo la classe dei punti precedenti
class Calciatore {
    public $nomeCalciatore; // Variabile di istanza per il nome
    public $numeroMaglia;   // Variabile di istanza per il numero
    public $squadra;        // Variabile di istanza per la squadra
    public $ruolo;          // Variabile di istanza per il ruolo
    public $figurina;       // Variabile di istanza per la foto

    // Costruttore
    public function __construct($nome, $numero, $squadra, $ruolo, $immagine) {
        $this->nomeCalciatore = $nome; // Init
        $this->numeroMaglia = $numero; // Init
        $this->squadra = $squadra;     // Init
        $this->ruolo = $ruolo;         // Init
        $this->figurina = $immagine;   // Init
    }

    // La traccia OBBLIGA ad usare questa funzione per restituire il valore da assegnare alla classe
    public function getClasseCssRuolo() {
        $ruoloFormattato = strtolower($this->ruolo); // Standardizzo in minuscolo
        if ($ruoloFormattato == 'attaccante') return 'attaccante'; // Ritorno classe attaccante
        if ($ruoloFormattato == 'difensore') return 'difensore'; // Ritorno classe difensore
        if ($ruoloFormattato == 'portiere') return 'portiere'; // Ritorno classe portiere
        return ''; // Default
    }

    // Metodo specifico per generare la riga della tabella (<tr>) per questo calciatore
    public function stampaRigaTabella() {
        // Ottengo la classe del colore tramite la funzione obbligatoria
        $classeCss = $this->getClasseCssRuolo();
        
        // Apro la riga della tabella
        echo "<tr>";
        // Stampo la cella con l'immagine
        echo "<td><img src='" . $this->figurina . "' alt='" . $this->nomeCalciatore . "'></td>";
        // Stampo la cella con il nome
        echo "<td>" . $this->nomeCalciatore . "</td>";
        // Stampo la cella con il numero di maglia
        echo "<td>" . $this->numeroMaglia . "</td>";
        // Stampo la cella con la squadra
        echo "<td>" . $this->squadra . "</td>";
        // Stampo la cella del ruolo, applicando al tag <span> la classe del colore recuperata prima
        echo "<td><span class='" . $classeCss . "'>" . $this->ruolo . "</span></td>";
        // Chiudo la riga della tabella
        echo "</tr>";
    }
}

// Struttura della pagina HTML, includo il file CSS per formattazione e colori
echo "<!DOCTYPE html><html><head><title>Punto 3</title><link rel='stylesheet' type='text/css' href='style.css'></head><body>";

// Riciclo l'array creato e popolato nel punto 2
$listaGiocatori = array();
$listaGiocatori[] = new Calciatore("Mattia Perin", 1, "Juventus", "portiere", "https://placehold.co/150x150/000000/FFFFFF/png?text=Perin");
$listaGiocatori[] = new Calciatore("Michele Di Gregorio", 29, "Juventus", "portiere", "https://placehold.co/150x150/000000/FFFFFF/png?text=Di+Gregorio");
$listaGiocatori[] = new Calciatore("Carlo Pinsoglio", 23, "Juventus", "portiere", "https://placehold.co/150x150/000000/FFFFFF/png?text=Pinsoglio");
$listaGiocatori[] = new Calciatore("Dusan Vlahovic", 9, "Juventus", "attaccante", "https://placehold.co/150x150/000000/FFFFFF/png?text=Vlahovic");
$listaGiocatori[] = new Calciatore("Gleison Bremer", 3, "Juventus", "difensore", "https://placehold.co/150x150/000000/FFFFFF/png?text=Bremer");
// Stampo il tag di apertura della tabella HTML
echo "<table>";
// Stampo l'intestazione della tabella (i titoli delle colonne)
echo "<thead><tr><th>Foto</th><th>Nome</th><th>Numero</th><th>Squadra</th><th>Ruolo</th></tr></thead>";
// Apro il corpo della tabella
echo "<tbody>";

// Come richiesto obbligatoriamente dal Punto 3, utilizzo il ciclo foreach per scorrere l'array
foreach ($listaGiocatori as $giocatore) {
    // Per ogni giocatore, chiamo il metodo che stampa la sua riga (<tr>) della tabella
    $giocatore->stampaRigaTabella();
}

// Chiudo il corpo della tabella
echo "</tbody>";
// Chiudo il tag principale della tabella
echo "</table>";

// Chiudo il documento HTML
echo "</body></html>";
?>
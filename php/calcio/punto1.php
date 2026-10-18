<?php
// Definisco la classe 'Calciatore' per utilizzare la Programmazione Orientata agli Oggetti (OOP)
class Calciatore {
    
    // Dichiaro le proprietà della classe (corrispondono alle variabili richieste)
    public $nomeCalciatore; // Memorizza il nome del giocatore
    public $numeroMaglia;   // Memorizza il numero di maglia
    public $squadra;        // Memorizza la squadra attuale o passata
    public $ruolo;          // Memorizza il ruolo (attaccante, difensore, portiere)
    public $figurina;       // Memorizza il link all'immagine del giocatore

    // Costruttore della classe: viene chiamato automaticamente quando creo un nuovo oggetto
    public function __construct($nome, $numero, $squadra, $ruolo, $immagine) {
        $this->nomeCalciatore = $nome; // Assegno il valore passato in input alla proprietà nomeCalciatore
        $this->numeroMaglia = $numero; // Assegno il valore in input alla proprietà numeroMaglia
        $this->squadra = $squadra;     // Assegno il valore in input alla proprietà squadra
        $this->ruolo = $ruolo;         // Assegno il valore in input alla proprietà ruolo
        $this->figurina = $immagine;   // Assegno il valore in input alla proprietà figurina
    }

    // Metodo per stampare la presentazione HTML del singolo calciatore (Punto 1)
    public function stampaPresentazioneBase() {
        // Stampo l'intestazione automatizzata usando la proprietà nomeCalciatore
        echo "<h2>Il mio giocatore preferito è " . $this->nomeCalciatore . "</h2>";
        
        // Stampo il paragrafo automatizzato concatenando le varie proprietà
        echo "<p>Nella squadra " . $this->squadra . " gioca " . $this->nomeCalciatore . " con numero di maglia " . $this->numeroMaglia . " e il suo ruolo è " . $this->ruolo . ".</p>";
        
        // Stampo il tag img HTML inserendo nell'attributo src la variabile con il link della figurina
        echo "<img src='" . $this->figurina . "' alt='Foto di " . $this->nomeCalciatore . "' style='width:200px;'>";
    }
}

// Inizio il documento HTML
echo "<!DOCTYPE html><html><head><title>Punto 1</title></head><body>";

// Dichiaro le variabili singole come richiesto dalla traccia
$nomeCalciatore = "Mattia Perin"; // Inizializzo il nome del calciatore
$numeroMaglia = 1; // Inizializzo il numero di maglia
$squadra = "Juventus"; // Inizializzo la squadra
$ruolo = "portiere"; // Inizializzo il ruolo
$figurina = "https://upload.wikimedia.org/wikipedia/commons/4/4e/Mattia_Perin.jpg"; // Inizializzo il link della foto

// Creo un'istanza (un oggetto) della classe Calciatore passando le variabili appena dichiarate
$mioGiocatore = new Calciatore($nomeCalciatore, $numeroMaglia, $squadra, $ruolo, $figurina);

// Richiamo il metodo dell'oggetto per stampare a schermo l'HTML
$mioGiocatore->stampaPresentazioneBase();

// Chiudo il documento HTML
echo "</body></html>";
?>
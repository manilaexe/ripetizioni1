# Gestione Biblioteca in Java

## Obiettivo
Realizzare un programma Java per la gestione di una biblioteca utilizzando i concetti di ereditarietà, polimorfismo, classi astratte, interfacce, array e gestione delle eccezioni.
Il programma dovrà simulare il funzionamento di una biblioteca nella quale sono presenti diversi tipi di libri e diversi tipi di utenti.

## Specifiche delle Classi

### 1. Classe Astratta `Persona`
Rappresenta una persona iscritta alla biblioteca.
* **Attributi:**
  * nome completo;
  * età;
  * indirizzo e-mail.
* **Implementare:**
  * un costruttore parametrico completo;
  * i metodi getter e setter;
  * un metodo `toString()` che restituisca le informazioni della persona.
* **Controllo validità:** Nel costruttore dovrà essere verificata la validità dell'età. Se il valore inserito è minore o uguale a zero dovrà essere lanciata un'opportuna eccezione personalizzata.

### 2. Classe `Utente` (estende `Persona`)
* **Attributi:**
  * numero della tessera;
  * numero di libri attualmente presi in prestito;
  * stato della tessera (attiva o sospesa).
* **Funzionalità (metodi):**
  * prendere in prestito un libro;
  * restituire un libro;
  * verificare se può effettuare un nuovo prestito.
* **Override:** Personalizzare il metodo `toString()` aggiungendo le informazioni relative alla tessera.

### 3. Classe Astratta `Libro`
* **Attributi:**
  * codice identificativo;
  * titolo;
  * autore;
  * stato del prestito.
* **Implementare:** un metodo astratto che permetta di visualizzare il tipo di libro.

### 4. Classi `Romanzo` e `Manuale` (estendono `Libro`)
* Ogni classe dovrà aggiungere almeno un attributo specifico e personalizzare il metodo `toString()`.

### 5. Interfaccia `Prestabile`
* Contenente i metodi:
  * `presta();`
  * `restituisci();`
* **Nota:** Le classi derivate da Libro dovranno implementare tale interfaccia.

## Classe `Biblioteca`
La biblioteca dovrà contenere un array di libri e un array di utenti (la dimensione degli array verrà scelta tramite costruttore).

**Metodi da implementare:**
* aggiungere un libro alla biblioteca;
* aggiungere un utente;
* cercare un libro tramite codice identificativo;
* cercare un utente tramite numero di tessera;
* visualizzare tutti i libri presenti;
* visualizzare tutti gli utenti registrati;
* contare quanti libri sono attualmente disponibili;
* contare quanti libri risultano in prestito;
* stampare tutti i romanzi presenti;
* stampare tutti i manuali presenti.

**Metodi per i prestiti:**
* `public void effettuaPrestito(String codiceLibro, String numeroTessera)`: permette ad un utente di prendere in prestito un libro solamente se: 
  * il libro è disponibile;
  * la tessera dell'utente è attiva;
  * l'utente non ha superato il numero massimo di prestiti consentiti.
  *(In caso contrario dovrà essere generata un'opportuna eccezione personalizzata).*
* `public void restituzioneLibro(String codiceLibro)`: permette di restituire un libro aggiornando lo stato del libro e dell'utente.

## Gestione delle Eccezioni
Il programma dovrà prevedere almeno le seguenti eccezioni personalizzate:
* `EtaNonValidaException`
* `LibroNonDisponibileException`
* `LibroNonTrovatoException`
* `UtenteNonTrovatoException`
* `PrestitoNonConsentitoException`

Le eccezioni dovranno essere opportunamente gestite nel programma principale mediante blocchi `try-catch`.

## Programma Principale (Main)
Nel main dovranno essere eseguite almeno le seguenti operazioni:
1. Creare diversi utenti.
2. Creare diversi romanzi e manuali.
3. Inserire utenti e libri nella biblioteca.
4. Stampare tutti i libri presenti.
5. Stampare tutti gli utenti registrati.
6. Cercare un libro tramite il suo codice identificativo.
7. Effettuare alcuni prestiti.
8. Provare ad effettuare un prestito non consentito verificando il corretto funzionamento delle eccezioni.
9. Restituire alcuni libri.
10. Stampare il numero di libri disponibili e il numero di libri in prestito.
11. Stampare tutti i romanzi e tutti i manuali presenti nella biblioteca.

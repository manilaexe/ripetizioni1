# Gestione Compagnia Aerea in Java

## Obiettivo
Realizzare un programma Java per la gestione di una compagnia aerea utilizzando i principali concetti della programmazione orientata agli oggetti: ereditarietà, polimorfismo, classi astratte, interfacce, `ArrayList` e gestione delle eccezioni.
Il programma dovrà simulare la gestione delle persone presenti all'interno di una compagnia aerea e degli aerei disponibili per i vari voli.

## Specifiche delle Classi

### 1. Classe Astratta `Persona`
Rappresenta una persona generica presente nel sistema.
* **Attributi:**
  * nome completo;
  * età;
  * indirizzo email.
* **Implementare:**
  * un costruttore parametrico completo;
  * i metodi getter e setter;
  * un metodo `toString()` che permetta di visualizzare in modo ordinato le informazioni della persona.
* **Controllo validità:** Nel costruttore dovranno essere effettuati alcuni controlli sui dati inseriti. In particolare, l'età dovrà essere considerata valida solamente se maggiore di zero. Nel caso venga inserito un valore non valido dovrà essere generata e gestita un'opportuna eccezione personalizzata.

### 2. Classe `Passeggero` (estende `Persona`)
* **Attributi:**
  * numero del documento;
  * la classe del biglietto acquistato;
  * lo stato del pagamento del biglietto.
* **Funzionalità (metodi):**
  * acquistare un biglietto;
  * verificare se il passeggero possiede un titolo di viaggio valido;
  * stabilire eventuali agevolazioni in base all'età del passeggero.
* **Override e Controlli:**
  * Il metodo `toString()` dovrà essere personalizzato aggiungendo le informazioni relative al viaggio.
  * Nel caso venga tentato l'acquisto di un biglietto con dati non validi (ad esempio classe inesistente o documento mancante) dovrà essere generata una specifica eccezione.

### 3. Interfaccia `Operatore`
* Contenente i metodi:
  * timbrare l'ingresso;
  * timbrare l'uscita.

### 4. Classe Astratta `Personale` (estende `Persona`)
Questa classe rappresenterà tutti i dipendenti della compagnia aerea.
* **Attributi:**
  * matricola del dipendente;
  * stipendio base.
* **Nota:** Tutti i membri del personale dovranno implementare i metodi dell'interfaccia `Operatore`.

### 5. Classe `Pilota` (estende `Personale` e implementa `Operatore`)
* **Attributi:**
  * numero di ore di volo effettuate;
  * grado professionale.
* **Implementare:**
  * i metodi dell'interfaccia `Operatore`, stampando data e ora dell'operazione effettuata;
  * un controllo per verificare se un pilota possiede un numero sufficiente di ore di volo per poter comandare un determinato aereo. Nel caso il pilota non abbia esperienza sufficiente dovrà essere generata un'eccezione specifica.

### 6. Classe `AssistenteDiVolo` (estende `Personale` e implementa `Operatore`)
* **Attributi:**
  * numero di voli effettuati;
  * lingua principale conosciuta.
* **Implementare:** i metodi dell'interfaccia `Operatore`.

## Gestione Flotta e Compagnia

### 1. Classe `Aereo`
Rappresenta un singolo mezzo della compagnia.
* **Attributi:**
  * codice identificativo;
  * modello;
  * numero massimo di persone trasportabili;
  * elenco delle persone presenti a bordo (da gestire tramite un `ArrayList<Persona>`).
* **Metodi da implementare:**
  * aggiungere una persona a bordo *(Nota: se l'aereo ha raggiunto la capacità massima, generare un'eccezione personalizzata, es. `AereoPienoException`)*;
  * rimuovere una persona;
  * stampare tutte le persone presenti;
  * contare il numero di passeggeri;
  * contare il numero di membri del personale.

### 2. Classe `CompagniaAerea`
Permette di gestire tutti gli aerei disponibili.
* **Attributi:**
  * Un `ArrayList<Aereo>` per memorizzare gli aerei della compagnia.
* **Metodi da implementare:**
  * aggiungere un nuovo aereo;
  * cercare un aereo tramite codice identificativo *(Nota: se richiesto un aereo inesistente, generare un'eccezione `AereoNonTrovatoException`)*;
  * stampare tutti gli aerei disponibili;
  * trovare l'aereo con il maggior numero di passeggeri;
  * calcolare il numero totale di passeggeri presenti nella compagnia.
* **Metodi di volo e controllo:**
  * `public boolean decolla(Aereo aereo)`: permette ad un aereo di partire solamente se:
    1. è presente almeno un pilota abilitato;
    2. è presente almeno un assistente di volo;
    3. tutti i passeggeri possiedono un biglietto valido;
    4. l'aereo non è vuoto.
    *(Se una delle condizioni non viene rispettata dovrà essere generata un'opportuna eccezione oppure restituito un valore negativo).*
  * `public String controlloPasseggeri(Aereo aereo)`: restituisce una statistica relativa ai passeggeri presenti a bordo indicando:
    * numero di bambini;
    * numero di anziani;
    * numero di passeggeri adulti;
    * numero di passeggeri senza biglietto.

## Gestione delle Eccezioni
Il programma dovrà prevedere la creazione delle seguenti eccezioni personalizzate:
* `EtaNonValidaException`: generata quando viene inserita un'età non corretta.
* `BigliettoNonValidoException`: generata quando un passeggero tenta di acquistare o utilizzare un biglietto non valido.
* `AereoPienoException`: generata quando si tenta di superare il numero massimo di posti disponibili.
* `AereoNonTrovatoException`: generata quando viene cercato un aereo inesistente.
* `PilotaNonAbilitatoException`: generata quando un pilota non possiede i requisiti necessari.

Le eccezioni dovranno essere gestite tramite blocchi `try-catch` nel programma principale, mostrando messaggi chiari all'utente.

## Programma Principale (Main)
Creare un programma di test che permetta di verificare il corretto funzionamento del sistema. Nel main si dovrà:
1. Creare diversi passeggeri con età differenti.
2. Creare alcuni piloti e assistenti di volo.
3. Creare almeno due aerei con caratteristiche differenti.
4. Inserire persone all'interno degli aerei.
5. Provare ad aggiungere persone oltre la capacità massima per verificare la gestione delle eccezioni.
6. Stampare il contenuto degli aerei.
7. Cercare persone e aerei tramite i metodi disponibili.
8. Effettuare il controllo dei passeggeri.
9. Provare il decollo degli aerei in diverse condizioni:
   * situazione corretta;
   * passeggeri senza biglietto;
   * assenza di personale;
   * pilota non abilitato.
10. Gestire correttamente tutti gli errori tramite le eccezioni previste.
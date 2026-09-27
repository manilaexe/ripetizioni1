# Gestione Sistema Ferroviario

## Obiettivo
Realizzare un programma in Java per simulare la gestione dei passeggeri e del personale a bordo di un treno. Il progetto richiede l'applicazione dei concetti di classi astratte, interfacce, ereditarietà, polimorfismo e gestione degli array.

## Specifiche delle Classi ed Interfacce

### 1. Classe Astratta `Persona`
Questa classe rappresenta una persona generica all'interno del sistema[cite: 25].
* **Attributi:**
  * `nome` di tipo `String`[cite: 25];
  * `anni` di tipo `int`[cite: 25];
  * `email` di tipo `String`[cite: 25].
* **Implementare:**
  * Un costruttore parametrico che inizializzi i campi[cite: 25]. Se l'età inserita è minore di 1, deve essere impostata automaticamente a 1 e deve essere stampato un messaggio di avviso[cite: 25].
  * Metodi getter e setter per tutti gli attributi, riapplicando il controllo per garantire un'età valida (`>= 1`) nel relativo setter[cite: 25].
  * Un metodo `toString()` che restituisca i dati formattati come: `[Nome], età: [anni] anni, indirizzo e-mail: [email]`[cite: 25].

### 2. Interfaccia `Personale`
Questa interfaccia definisce le azioni base obbligatorie per i dipendenti[cite: 26].
* **Metodi da dichiarare:**
  * `timbraCartellino()`[cite: 26];
  * `riceviStipendio()`[cite: 26].

### 3. Classe Astratta `Addetto` (estende `Persona`, implementa `Personale`)
Rappresenta un dipendente generico delle ferrovie[cite: 21].
* **Attributi:**
  * `bustaPaga` di tipo `double` (con visibilità `protected`)[cite: 21].
* **Implementare:**
  * Un costruttore che richiami la superclasse e inizializzi la busta paga[cite: 21].
  * Metodi getter e setter per l'attributo `bustaPaga`[cite: 21].
  * L'override di `toString()` per premettere la dicitura `"Impiegato delle ferrovie: "` ai dati anagrafici della persona[cite: 21].

### 4. Classe `Controllore` (estende `Addetto`)
* **Attributi:**
  * `stipendioTotale` di tipo `double`[cite: 22].
* **Implementare:**
  * Un costruttore che, oltre a richiamare quello della superclasse, inizializzi lo stipendio totale a `0`[cite: 22].
  * L'implementazione di `timbraCartellino()` per stampare a schermo la stringa `"Timbro: "` seguita dalla data e dall'ora attuali tramite `LocalDateTime`[cite: 22].
  * L'implementazione di `riceviStipendio()` per incrementare lo `stipendioTotale` aggiungendo il valore della `bustaPaga`[cite: 22].
  * Un metodo `controlloBiglietto(Treno freccia)` che iteri sulle persone a bordo del treno e restituisca una stringa formattata con le statistiche dei passeggeri divisi tra: Junior, Senior, Adulti con biglietto e Adulti senza biglietto[cite: 22].
  * Un metodo `fischia(Treno freccia)` che consenta la partenza del treno stampando un messaggio di via libera (fischio di partenza) **solo se** a bordo ci sono almeno 2 controllori e **nessun** passeggero è sprovvisto di biglietto; in caso contrario deve stampare un esplicito messaggio indicante il motivo del divieto di partenza[cite: 22].
  * L'override di `toString()` per aggiungere in coda la dicitura `". Mansione: Controllore."`[cite: 22].

### 5. Classe `Passeggero` (estende `Persona`)
* **Attributi (privati):**
  * `biglietto`, `senior`, `junior` di tipo `boolean`[cite: 24].
* **Implementare:**
  * Un costruttore che verifichi automaticamente l'età: se il passeggero ha meno di 13 anni (Junior) o più di 59 anni (Senior), ottiene automaticamente il biglietto e il relativo stato (`junior` o `senior`) viene impostato a `true`[cite: 24].
  * Un metodo `paga()` che permetta di impostare il biglietto a `true` nel caso in cui il passeggero non appartenga né alla fascia Junior né a quella Senior[cite: 24].
  * L'override di `toString()` per includere una frase finale che specifichi se il passeggero viaggia gratis per limiti d'età oppure se possiede o meno il normale titolo di viaggio[cite: 24].

### 6. Classe `Treno`
Rappresenta il mezzo di trasporto[cite: 27].
* **Attributi:**
  * Un array `persone` di tipo `Persona`, dimensionato nel costruttore per accogliere massimo 10 elementi[cite: 27].
  * Un contatore `postiOccupati` inizializzato a `0`[cite: 27].
* **Implementare:**
  * Un metodo `aBordo(Persona persona)` che consenta di aggiungere una persona all'array solo se ci sono posti disponibili, restituendo un messaggio di conferma, oppure un messaggio indicante che il treno è pieno qualora non vi sia più spazio[cite: 27].

## Programma Principale (Main)
All'interno della classe principale dotata del metodo `main`, implementare in sequenza le seguenti operazioni di test[cite: 23]:
1. Creare diverse istanze di `Passeggero` con età miste, assicurandosi di includere profili senior, junior e adulti senza agevolazioni[cite: 23].
2. Creare almeno due istanze di `Controllore`[cite: 23].
3. Istanziare un oggetto `Treno` e far salire a bordo sia i passeggeri che i controllori invocando il metodo `aBordo()`, stampandone l'esito a schermo[cite: 23].
4. Utilizzare un controllore per invocare e stampare il resoconto completo restituito dal metodo `controlloBiglietto()`[cite: 23].
5. Utilizzare un controllore per invocare il metodo `fischia()` e verificare la logica dei requisiti di partenza del treno[cite: 23].
6. Invocare `riceviStipendio()` sui controllori e stampare in console i rispettivi stipendi totali accumulati[cite: 23].
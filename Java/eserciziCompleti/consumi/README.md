# Gestione Consumi di una vettura

## Obiettivo
Realizzare un programma Java per gestire il calcolo dei consumi di un'automobile e simulare il rifornimento, approfondendo l'acquisizione di dati in input e la gestione avanzata delle eccezioni (sia predefinite che personalizzate). Tutte le classi dovranno appartenere al package `consumi`[cite: 18, 19, 20].

## Specifiche delle Classi

### 1. Eccezione Personalizzata `CarburanteErratoException`
Questa classe deve estendere la classe base `Exception`[cite: 19].
* **Implementare:**
  * un costruttore vuoto che richiami il costruttore della superclasse passandogli il seguente messaggio di errore: `"È stato inserito il carburante errato!!!"`[cite: 19].

### 2. Classe `Auto`
Rappresenta l'automobile da gestire nel programma[cite: 18].
* **Attributi:**
  * `km_l` di tipo `double` (inizializzato a `0`)[cite: 18];
  * `CAPIENZA_MAX` come costante `public static final int` impostata a `80`[cite: 18];
  * `livello_carburante` di tipo `int`[cite: 18];
  * `tipoCarburante` di tipo `String`[cite: 18].
* **Costruttore e Metodi Base:**
  * Un costruttore senza parametri che imposti di default il tipo di carburante a `"Benzina"` e il livello di carburante a `0`[cite: 18].
  * I metodi getter e setter per l'attributo `tipoCarburante`[cite: 18].
* **Metodo `calcolaConsumi()`:**
  * Deve richiedere all'utente (tramite la classe `Scanner`) l'inserimento dei chilometri percorsi e dei litri di benzina consumati[cite: 18].
  * Se i litri inseriti sono pari a zero, deve lanciare manualmente un'eccezione `ArithmeticException`[cite: 18].
  * Deve calcolare e stampare a video i chilometri percorsi al litro (`km_l`)[cite: 18].
  * L'intera logica di acquisizione e calcolo deve essere racchiusa in un blocco `try-catch` capace di intercettare separatamente:
    * `ArithmeticException` (mostrando un messaggio ironico se vengono inseriti 0 litri, es. "Sicuro che la tua auto non consumi carburante?")[cite: 18];
    * `InputMismatchException` (per gestire l'inserimento di dati non numerici validi)[cite: 18];
    * `Exception` (come blocco catch generico per gestire errori imprevisti stampando lo stack trace)[cite: 18].
* **Metodo `rifornisci(String tipoCarburante, int quantita)`:**
  * Deve segnalare (tramite la clausola `throws`) la possibile generazione dell'eccezione `CarburanteErratoException`[cite: 18].
  * Se il carburante passato in input non coincide con il tipo di carburante dell'auto (ignorando la differenza tra maiuscole e minuscole), deve lanciare l'eccezione `CarburanteErratoException`[cite: 18].
  * Se compatibile, deve aggiungere la quantità al `livello_carburante` attuale[cite: 18].
  * Se il nuovo livello supera la `CAPIENZA_MAX`, il livello deve essere limitato al valore della capacità massima[cite: 18].
  * Stampare un messaggio per confermare l'avvenuto rifornimento[cite: 18].

## Programma Principale (`Consumi`)
All'interno della classe contenente il metodo `main`, strutturare le seguenti operazioni di test[cite: 20]:
1. Creare una nuova istanza della classe `Auto`[cite: 20].
2. Testare il calcolo invocando il metodo `calcolaConsumi()`, in modo da verificare le eccezioni relative all'input utente[cite: 20].
3. Testare il rifornimento chiamando il metodo `rifornisci()` e fornendo un carburante palesemente errato (ad esempio `"Metano"` per `20` litri)[cite: 20].
4. Quest'ultima invocazione dovrà essere inserita all'interno di un blocco `try-catch` apposito per intercettare la `CarburanteErratoException` e stampare a schermo il messaggio d'errore da essa trasportato[cite: 20].
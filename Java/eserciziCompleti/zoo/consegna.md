#  Gestione Zoo 

## Obiettivo
Realizzare un programma in Java per gestire gli animali di uno zoo, applicando in modo approfondito i concetti di classi astratte, ereditarietà a più livelli, interfacce e polimorfismo[cite: 28, 30, 33]. Il sistema dovrà inoltre gestire una collezione personalizzata di oggetti basata su `ArrayList`, prevedendo l'inserimento, l'estrazione mirata e il filtraggio dei dati[cite: 32]. Tutte le classi create dovranno appartenere al package `zoo`[cite: 28].

## Specifiche delle Classi e Interfacce

### 1. Classe Astratta `Animal`
Questa classe funge da radice per tutti gli animali dello zoo[cite: 28].
* **Attributi:** `nome` di tipo `String` ed `eta` di tipo `double`[cite: 28].
* **Costruttori:** implementare un costruttore vuoto (che inizializzi i campi con valori di default) e un costruttore parametrico[cite: 28].
* **Metodi implementati:** metodi getter e setter per tutti gli attributi[cite: 28].
* **Metodi astratti:** dichiarare `mangia()`, `muoviti()` e `faiVerso()`[cite: 28].

### 2. Classe Astratta `Quadrupede` (estende `Animal`)
Rappresenta una categoria intermedia di animali[cite: 33].
* **Costruttori:** implementare i costruttori vuoto e parametrico, richiamando quelli della superclasse mediante `super`[cite: 33].
* **Implementazione metodi:** fornire un'implementazione del metodo `muoviti()` affinché stampi la stringa `"Vado a 4 zampe..."`[cite: 33].

### 3. Interfaccia `Domestico`
Definisce le capacità degli animali che possono interagire con l'uomo[cite: 30].
* **Metodi da dichiarare:** il metodo `eseguiComando()`[cite: 30].

### 4. Classe `Cane` (estende `Quadrupede`, implementa `Domestico`)
Rappresenta un cane all'interno dello zoo[cite: 29].
* **Costruttori:** vuoto e parametrico, che richiamano i costruttori genitore[cite: 29].
* **Implementazione metodi:** 
  * `mangia()` dovrà stampare `"Mangio ossa..."`[cite: 29].
  * `faiVerso()` dovrà stampare `"Bau!"`[cite: 29].
  * `eseguiComando()` dovrà stampare `"Seduto!"`[cite: 29].

### 5. Classe `Gatto` (estende `Quadrupede`, implementa `Domestico`)
Rappresenta un gatto all'interno dello zoo[cite: 31].
* **Costruttori:** vuoto e parametrico, che richiamano i costruttori genitore[cite: 31].
* **Implementazione metodi:**
  * `mangia()` dovrà stampare `"Bevo latte..."`[cite: 31].
  * `faiVerso()` dovrà stampare `"Miao!"`[cite: 31].
  * `eseguiComando()` dovrà stampare `"Anche no!"`[cite: 31].

### 6. Classe `ListaZoo`
Classe wrapper che incapsula la logica di gestione della lista degli animali[cite: 32].
* **Attributi:** dichiarare una lista privata `lista` di tipo `ArrayList<Animal>` e inizializzarla nel costruttore[cite: 32].
* **Metodi di inserimento:**
  * `inserisciInCoda(Animal x)`: aggiunge l'animale alla fine della lista[cite: 32].
  * `inserisciInTesta(Animal x)`: inserisce l'animale all'indice zero[cite: 32].
  * `inserisciInPosizione(Animal x, int pos)`: aggiunge l'animale in un indice specifico, o in coda se l'indice risulta non valido[cite: 32].
* **Metodi di estrazione (rimozione):**
  * `estraiDaTesta()`, `estraiDaCoda()`, e `estraiDaPosizione(int indice)`: devono rimuovere e restituire l'animale richiesto, lanciando l'eccezione `NoSuchElementException` in caso di lista vuota o indice non valido[cite: 32].
  * `estraiDaNome(String nome)`: ricerca l'animale per nome (ignorando il maiuscolo/minuscolo), lo rimuove e lo restituisce, lanciando `NoSuchElementException` se non viene trovato[cite: 32].
* **Metodi di iterazione e filtraggio:**
  * `stampaNomi()`: cicla la lista stampando i nomi degli animali[cite: 32].
  * `stampaVersi()`: cicla la lista richiamando il metodo `faiVerso()` per ciascun elemento[cite: 32].
  * `piuGiovaniDi(double eta)`: crea e restituisce un nuovo oggetto `ListaZoo` contenente solamente gli animali con un'età inferiore a quella passata come parametro[cite: 32].

## Programma Principale (`Zoo`)
All'interno della classe contenente il `main`, eseguire i seguenti passaggi di test[cite: 34]:
1. Istanziare un cane e un gatto assegnandoli a variabili di tipo `Animal`, invocando poi su di essi il metodo `faiVerso()`[cite: 34].
2. Effettuare un casting esplicito all'interfaccia `Domestico` per entrambi gli oggetti e invocare `eseguiComando()`[cite: 34].
3. Creare un'istanza di `ListaZoo` e popolarla usando l'inserimento in coda, l'inserimento in testa e l'inserimento in posizione centrale[cite: 34].
4. Stampare tutti i nomi e i versi degli animali presenti nella lista invocando i metodi appositi[cite: 34].
5. Testare l'estrazione dalla lista richiamando `estraiDaNome()` con un nome noto, e stampare il risultato ottenuto[cite: 34].
6. Testare il filtraggio invocando `piuGiovaniDi()` (ad esempio per età inferiori a 6 anni) e stampare i nomi della nuova lista generata[cite: 34].
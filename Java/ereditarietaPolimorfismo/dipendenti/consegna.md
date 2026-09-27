# PCalcolo Stipendi 

## Obiettivo
Realizzare un semplice programma in Java che permetta di gestire le retribuzioni dei dipendenti di un'azienda avvalendosi dei concetti di ereditarietà, override dei metodi e polimorfismo, memorizzando gli oggetti all'interno di un array.

## Specifiche delle Classi

### 1. Classe `Dipendente`
Questa classe funge da classe base per tutto il personale dell'azienda[cite: 10].
* **Attributi:**
  * `nome` di tipo `String`, impostato con visibilità `protected`[cite: 10].
* **Implementare:**
  * un costruttore che accetti il nome come parametro e lo inizializzi[cite: 10];
  * un metodo `stipendio()` che restituisca una retribuzione di base predefinita (ad esempio `0` per la classe genitore)[cite: 10].

### 2. Classe `Impiegato` (estende `Dipendente`)
* **Implementare:**
  * un costruttore che accetti il nome dell'impiegato e richiami il costruttore della superclasse[cite: 11];
  * l'override del metodo `stipendio()`, in modo che restituisca un valore fisso per questa categoria (ad esempio `1200`)[cite: 11].

### 3. Classe `Manager` (estende `Dipendente`)
* **Implementare:**
  * un costruttore che accetti il nome del manager e richiami il costruttore della superclasse[cite: 13];
  * l'override del metodo `stipendio()`, in modo che restituisca uno stipendio calcolato come base più un bonus (ad esempio `2000 + 500`)[cite: 13].

## Programma Principale (Main)
All'interno della classe principale, creare un metodo `main` per testare il sistema[cite: 12]:
1. Creare un array di tipo `Dipendente` capace di contenere 2 elementi[cite: 12].
2. Popolare l'array istanziando un `Impiegato` (es. "Luca") e un `Manager` (es. "Sara") e assegnandoli alle posizioni dell'array (sfruttando il polimorfismo/upcasting)[cite: 12].
3. Utilizzare un ciclo `for-each` per scorrere tutti i dipendenti presenti nell'azienda[cite: 12].
4. Per ogni iterazione, stampare a schermo il nome del dipendente e il risultato dell'invocazione del metodo `stipendio()`, dimostrando così la corretta esecuzione del metodo ridefinito in base all'effettivo tipo di oggetto istanziato[cite: 12].
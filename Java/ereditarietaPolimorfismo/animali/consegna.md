# Animali

## Obiettivo
Realizzare un semplice programma in Java per simulare i versi di diversi animali, applicando i concetti di base dell'ereditarietà, dell'override dei metodi e del polimorfismo.

## Specifiche delle Classi

### 1. Classe `Animale`
Questa classe dovrà rappresentare un animale generico[cite: 6].
* **Attributi:**
  * `nome` di tipo `String`, impostato con visibilità `protected`[cite: 6].
* **Implementare:**
  * un costruttore parametrico che inizializzi l'attributo `nome`[cite: 6];
  * un metodo getter per recuperare il nome dell'animale[cite: 6];
  * un metodo `verso()` che stampi a schermo un messaggio generico (ad esempio "L'animale fa un verso")[cite: 6].

### 2. Classe `Cane` (estende `Animale`)
* **Implementare:**
  * un costruttore che accetti il nome del cane come parametro e richiami esplicitamente il costruttore della classe genitore[cite: 7];
  * l'override del metodo `verso()` affinché stampi il nome del cane seguito dal suo verso specifico ("Bau Bau!")[cite: 7].

### 3. Classe `Gatto` (estende `Animale`)
* **Implementare:**
  * un costruttore che accetti il nome del gatto come parametro e richiami esplicitamente il costruttore della classe genitore[cite: 8];
  * l'override del metodo `verso()` affinché stampi il nome del gatto seguito dal suo verso specifico ("Miao!")[cite: 8].

## Programma Principale (Main)
All'interno della classe contenente il metodo `main`, implementare la seguente logica per dimostrare il funzionamento del polimorfismo[cite: 9]:
1. Creare un'istanza di `Cane` (ad esempio di nome "Luna") e un'istanza di `Gatto` (ad esempio di nome "Stella")[cite: 9].
2. Assegnare entrambe le istanze create a variabili di riferimento di tipo generale `Animale` (upcasting)[cite: 9].
3. Richiamare il metodo `verso()` su ciascun riferimento creato[cite: 9].
4. Osservare a schermo come, grazie al polimorfismo, venga correttamente invocato il metodo `verso()` specifico per ogni animale, nonostante il riferimento sia di tipo base.
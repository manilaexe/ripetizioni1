# Calcolo delle Aree

## Obiettivo
Realizzare un programma in Java che permetta di calcolare l'area di diverse figure geometriche, sfruttando i principi dell'ereditarietà, dell'override dei metodi e del polimorfismo mediante l'utilizzo di un array.

## Specifiche delle Classi

### 1. Classe `Figura`
Questa classe funge da classe genitore per le forme geometriche[cite: 14].
* **Implementare:**
  * un metodo `area()` che restituisca un valore predefinito di tipo `double` (ad esempio `0`)[cite: 14].

### 2. Classe `Quadrato` (estende `Figura`)
* **Attributi:**
  * `lato` di tipo `double`, impostato con visibilità `private`[cite: 16].
* **Implementare:**
  * un costruttore parametrico che riceva il lato e lo inizializzi[cite: 16];
  * l'override del metodo `area()` affinché calcoli e restituisca l'area del quadrato (`lato * lato`)[cite: 16].

### 3. Classe `Rettangolo` (estende `Figura`)
* **Attributi:**
  * `base` di tipo `double`, impostato con visibilità `private`[cite: 17];
  * `altezza` di tipo `double`, impostato con visibilità `private`[cite: 17].
* **Implementare:**
  * un costruttore parametrico che riceva base e altezza e inizializzi entrambi gli attributi[cite: 17];
  * l'override del metodo `area()` affinché calcoli e restituisca l'area del rettangolo (`base * altezza`)[cite: 17].

## Programma Principale (Main)
All'interno della classe principale contenente il metodo `main`, implementare la seguente logica[cite: 15]:
1. Creare un array di tipo `Figura` con una dimensione pari a 2 elementi[cite: 15].
2. Popolare l'array inserendo nella prima posizione una nuova istanza di `Quadrato` (ad esempio con lato 4) e nella seconda posizione una nuova istanza di `Rettangolo` (ad esempio con base 3 e altezza 5)[cite: 15].
3. Utilizzare un ciclo `for-each` per iterare su tutte le figure presenti nell'array[cite: 15].
4. Ad ogni iterazione, stampare a schermo l'area della figura invocando il metodo `area()`, verificando così il corretto funzionamento del polimorfismo[cite: 15].
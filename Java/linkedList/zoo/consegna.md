# Gestione Zoo con Lista Concatenata

## Obiettivo
Realizzare un'evoluzione del sistema di gestione per uno zoo, sostituendo le collezioni predefinite di Java con una struttura dati personalizzata a lista singolarmente concatenata (Linked List) avvalendosi dei Generics. Il progetto consoliderà l'utilizzo di classi astratte, interfacce e polimorfismo. Tutte le classi dovranno appartenere al package `zoo`[cite: 38, 42, 43].

## Specifiche delle Classi Base e Interfacce

### 1. Classe Astratta `Animal`
* **Attributi e Costruttori:** Deve contenere `nome` (String) ed `eta` (double), gestiti tramite un costruttore vuoto e uno parametrico, con relativi metodi getter e setter[cite: 38].
* **Metodi Astratti:** Dichiarare `mangia()`, `muoviti()` e `faiVerso()`[cite: 38].

### 2. Classe Astratta `Quadrupede` (estende `Animal`)
* Implementa il costruttore vuoto e quello parametrico richiamando `super()`[cite: 44].
* Effettua l'override di `muoviti()` per stampare `"Vado a 4 zampe..."`[cite: 44].

### 3. Interfaccia `Domestico`
* Dichiara il metodo `eseguiComando()`[cite: 40].

### 4. Classi `Cane` e `Gatto` (estendono `Quadrupede`, implementano `Domestico`)
* Entrambe devono implementare i costruttori richiamando la superclasse[cite: 39, 41].
* **Per il `Cane`:** `mangia()` stampa `"Mangio ossa..."`, `faiVerso()` stampa `"Bau!"` ed `eseguiComando()` stampa `"Seduto!"`[cite: 39].
* **Per il `Gatto`:** `mangia()` stampa `"Bevo latte..."`, `faiVerso()` stampa `"Miao!"` ed `eseguiComando()` stampa `"Anche no!"`[cite: 41].

## Struttura Dati Personalizzata

### 5. Classe Generica `Nodo<T>`
Questa classe rappresenta il singolo elemento della lista concatenata[cite: 43].
* **Attributi:**
  * `dato` di tipo parametrico `T`[cite: 43].
  * `next` di tipo `Nodo<T>` (puntatore al nodo successivo)[cite: 43].
* **Implementare:**
  * Un costruttore che accetti in input il `dato` e inizializzi `next` a `null`[cite: 43].
  * Metodi getter e setter per entrambi gli attributi[cite: 43].

### 6. Classe `ListaZoo`
Classe che gestisce la lista concatenata specifica per gli animali[cite: 42].
* **Attributi:** `testa` di tipo `Nodo<Animal>`, inizializzata a `null` nel costruttore[cite: 42].
* **Metodi di Inserimento:**
  * `inserisciInTesta(Animal x)`: aggiunge l'animale come primo nodo della lista[cite: 42].
  * `inserisciInCoda(Animal x)`: scorre la lista e aggiunge l'animale in fondo[cite: 42].
  * `inserisciInPosizione(Animal x, int pos)`: aggiunge l'animale nell'indice specificato; se la lista è vuota o l'indice è minore o uguale a zero, effettua un inserimento in testa[cite: 42].
* **Metodi di Estrazione (lanciando `NoSuchElementException` se falliscono):**
  * `estraiDaTesta()`, `estraiDaCoda()`, e `estraiDaPosizione(int indice)`: restituiscono l'animale senza rimuoverlo, scorrendo i nodi secondo la logica richiesta[cite: 42].
  * `estraiDaNome(String nome)`: cerca l'animale per nome ignorando il maiuscolo/minuscolo e restituisce il dato corrispondente[cite: 42].
* **Metodi di Utilità:**
  * `stampaNomi()`: stampa i nomi di tutti gli animali nella lista[cite: 42].
  * `stampaVersi()`: richiama `faiVerso()` per ogni animale nella lista[cite: 42].
  * `piuGiovaniDi(double eta)`: restituisce una nuova `ListaZoo` contenente solo gli animali con età inferiore al parametro passato, inserendoli in coda[cite: 42].

## Programma Principale (`Zoo`)
All'interno del metodo `main`, testare a fondo la struttura creata[cite: 45]:
1. Istanziare la `ListaZoo` e aggiungervi in coda alcuni cani e gatti (es. Bob, Rex, Mao, Red)[cite: 45].
2. Verificare l'inserimento stampando i nomi iniziali[cite: 45].
3. Testare `inserisciInPosizione`, `inserisciInTesta` e `inserisciInCoda` con nuovi animali[cite: 45].
4. Verificare le estrazioni stampando il verso dell'animale in posizione 4 e di quello in coda[cite: 45].
5. Effettuare una ricerca per nome (es. "Mao") gestendola con un costrutto `try-catch`; se trovato, invocare i metodi `mangia()`, `muoviti()` e `faiVerso()`[cite: 45].
6. Effettuare una ricerca fallimentare intenzionale (es. "Gaia") sempre tramite `try-catch`, stampando un messaggio di errore[cite: 45].
7. Stampare i versi di tutti gli animali presenti[cite: 45].
8. Creare e stampare i nomi di una nuova lista filtrata per età (es. animali più giovani di 2.5 anni) utilizzando il metodo `piuGiovaniDi()`[cite: 45].
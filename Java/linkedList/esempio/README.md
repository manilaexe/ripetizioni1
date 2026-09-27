# Implementazione di una Lista Singolarmente Concatenata

## Obiettivo
Questo esercizio guida ha lo scopo di illustrare passo dopo passo come costruire da zero una struttura dati dinamica: la lista singolarmente concatenata (Linked List). Si andranno a definire i singoli elementi (nodi) e i principali algoritmi per la manipolazione della lista.

## Passaggio 1: La Classe `Nodo`
La prima classe da creare funge da "mattone" fondamentale della struttura[cite: 37].
* **Attributi:**
  * `dato` (di tipo `int`): per memorizzare l'informazione vera e propria[cite: 37].
  * `next` (di tipo `Nodo`): un puntatore (riferimento) all'elemento successivo della catena[cite: 37].
* **Implementare:**
  * Un costruttore che accetti in input il valore intero, assegnandolo all'attributo `dato`, e che inizializzi il puntatore `next` a `null`[cite: 37].
  * I metodi getter e setter per poter leggere e modificare sia il `dato` che il nodo `next`[cite: 37].

## Passaggio 2: La Classe `Lista`
Questa classe funge da gestore per coordinare tutti i nodi creati[cite: 35].
* **Attributi:**
  * `testa` (di tipo `Nodo`): rappresenta il punto di accesso alla lista (il primo elemento)[cite: 35].
* **Implementare il costruttore:**
  * Un costruttore senza parametri che inizializzi la `testa` a `null`, creando di fatto una lista vuota[cite: 35].
* **Implementare i seguenti algoritmi (metodi):**
  * `inserisciInTesta(int valore)`: crea un nuovo nodo e lo posiziona all'inizio della lista, facendolo puntare alla vecchia testa e aggiornando il riferimento principale[cite: 35].
  * `inserisciInCoda(int valore)`: crea un nuovo nodo, scorre la lista partendo dalla testa fino a trovare l'ultimo elemento (quello col `next` a `null`), e lo aggancia in fondo[cite: 35].
  * `inserisciInPosizione(int valore, int posizione)`: crea un nuovo nodo e lo inserisce nell'indice richiesto. Deve gestire correttamente i casi in cui la lista sia vuota, la posizione sia zero/negativa (agendo come inserimento in testa) o scorrendo i nodi fino a raggiungere l'indice desiderato[cite: 35].
  * `stampa()`: scorre l'intera lista dalla testa alla coda, stampando a video il dato contenuto in ogni nodo[cite: 35].
  * `contaElementi()`: attraversa la lista incrementando un contatore per ogni nodo visitato e ne restituisce il totale[cite: 35].
  * `cerca(int valore)`: scorre la lista per verificare se un determinato valore è presente; restituisce `true` se lo trova, `false` se arriva alla fine senza successo[cite: 35].

## Passaggio 3: Programma Principale di Test (`Main`)
All'interno della classe contenente il metodo `main`, eseguire la seguente sequenza guidata per testare la struttura creata[cite: 36]:
1. Istanziare un nuovo oggetto `Lista`[cite: 36].
2. Effettuare un paio di inserimenti in testa (ad esempio inserendo i valori `20` e poi `10`)[cite: 36].
3. Effettuare un paio di inserimenti in coda (ad esempio aggiungendo `30` e poi `40`)[cite: 36].
4. Richiamare il metodo `stampa()` per visualizzare a video lo stato attuale (l'ordine atteso sarà 10, 20, 30, 40)[cite: 36].
5. Invocare `contaElementi()` e stampare a schermo il numero totale degli elementi[cite: 36].
6. Testare il metodo `cerca()` passando un valore noto (es. `30`), gestendo l'output con un blocco `if-else` per stampare "Elemento trovato" o "Elemento non trovato"[cite: 36].
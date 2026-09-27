# Gestione Parcheggio in Java

## Obiettivo
Realizzare un programma Java che permetta di gestire un parcheggio utilizzando i concetti di ereditarietà, polimorfismo, classi astratte, interfacce e `ArrayList`.

## Specifiche delle Classi

### 1. Classe Astratta `Veicolo`
Contiene le informazioni comuni a tutti i veicoli.
* **Attributi:**
  * targa;
  * marca;
  * modello.
* **Implementare:**
  * i metodi getter e setter;
  * un costruttore parametrico completo;
  * un metodo `toString()`;
  * almeno un **metodo astratto** che verrà implementato in modo diverso dalle classi derivate.

### 2. Classi `Auto` e `Moto` (estendono `Veicolo`)
* **Attributi:** Ciascuna classe deve essere caratterizzata da almeno un attributo specifico (es. numero di porte per l'Auto, cilindrata per la Moto).
* **Implementare:**
  * il metodo astratto della classe genitore fornendo un'implementazione specifica;
  * personalizzare il metodo `toString()` aggiungendo le proprie informazioni.

### 3. Interfaccia (Operazioni Parcheggio)
* Rappresenta le operazioni eseguibili da un veicolo all'interno del parcheggio.
* **Metodi suggeriti:**
  * ingresso;
  * uscita.
* **Nota:** Le classi che rappresentano i veicoli dovranno implementare tale interfaccia fornendo un comportamento opportuno per ciascun metodo.

## Classe `Parcheggio`
La classe dovrà utilizzare un `ArrayList` per memorizzare tutti i veicoli presenti.

**Metodi da implementare per gestire la collezione:**
* aggiungere un veicolo al parcheggio;
* cercare un veicolo tramite la targa;
* cercare un veicolo in una determinata posizione dell'`ArrayList`;
* visualizzare l'elenco completo dei veicoli presenti;
* far eseguire a tutti i veicoli il metodo astratto definito nella classe base;
* contare separatamente quante automobili e quante motociclette sono presenti;
* ottenere una nuova lista contenente soltanto i veicoli che soddisfano una determinata caratteristica (ad esempio: tutte le auto elettriche, oppure tutte le moto con cilindrata superiore a un certo valore).

## Programma Principale (Main)
Nel main dovranno essere eseguiti i seguenti test per verificare il funzionamento del programma:
1. Creare alcuni veicoli di entrambe le tipologie (`Auto` e `Moto`).
2. Aggiungere i veicoli creati al parcheggio.
3. Verificare il corretto funzionamento di **tutti i metodi** realizzati nella classe `Parcheggio`.
4. Mostrare esplicitamente l'utilizzo del **polimorfismo**, dell'operatore `instanceof` e del **casting**.
5. Invocare i metodi della classe astratta, quelli specifici delle classi derivate e quelli definiti nell'interfaccia.

## Finalità Didattica
L'obiettivo dell'esercizio è progettare una semplice applicazione orientata agli oggetti che faccia un uso corretto e consapevole di classi astratte, ereditarietà, interfacce, `ArrayList`, polimorfismo, casting e algoritmi di ricerca all'interno di una collezione di oggetti.
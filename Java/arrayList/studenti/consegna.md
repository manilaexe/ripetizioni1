# Gestione Studenti con ArrayList

## Obiettivo
Realizzare un semplice programma in Java che permetta di memorizzare e filtrare un elenco di studenti e i rispettivi voti finali utilizzando la struttura dati `ArrayList`.

## Specifiche delle Classi

### 1. Classe `Studente`
Questa classe dovrà rappresentare la singola entità studente.
* **Attributi (privati):**
  * `nome` (String);
  * `voto` (double).
* **Implementare:**
  * un costruttore parametrico che permetta di inizializzare entrambi gli attributi al momento della creazione dell'oggetto;
  * i metodi getter e setter per l'accesso e la modifica di ciascun attributo;
  * un metodo `toString()` personalizzato che restituisca i dati dello studente formattati nel seguente modo: `"Nome: [nome] - Voto: [voto]"`.

## Programma Principale (Main)
All'interno della classe contenente il metodo `main`, implementare la seguente logica:
1. **Creazione Collezione:** Istanziare un `ArrayList` tipizzato per contenere oggetti di tipo `Studente`.
2. **Popolamento:** Aggiungere all'interno dell'array almeno 5 oggetti `Studente` con nomi e voti differenti, includendo sia votazioni sufficienti (>= 6) che insufficienti (< 6).
3. **Stampa Completa:** Iterare l'intera lista e visualizzare a schermo l'elenco completo degli studenti (inserendo un'opportuna intestazione, ad esempio "ELENCO STUDENTI").
4. **Filtro Promossi:** Iterare nuovamente la lista e stampare a video *esclusivamente* gli studenti che hanno ottenuto un voto maggiore o uguale a 6, segnalando l'operazione con un'intestazione dedicata (ad esempio "STUDENTI CON VOTO MAGGIORE O UGUALE A 6").
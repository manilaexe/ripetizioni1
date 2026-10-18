# Consegna: Esercizio PHP sui Calciatori

Per ogni punto svolto, creare un file PHP (se dovesse servire parte del codice per i punti successivi, basta riutilizzarlo su un nuovo file e lasciare intatto quello svolto precedentemente).

> **Attenzione:** La corretta progettazione dell'applicazione web sfruttando la *Programmazione Orientata agli Oggetti (OOP)* varrà un punteggio aggiuntivo.

---

## Punto 1

Dichiarare:
* La variabile `nomeCalciatore` inizializzata con il nome del vostro calciatore preferito (anche nomi inventati per chi non è appassionato di calcio, come il sottoscritto);
* La variabile `numeroMaglia` inizializzata con il numero della maglia (attuale o passato o QUALSIASI);
* La variabile `squadra` inizializzata con la squadra dove milita attualmente (o una dove è stato, o una QUALSIASI);
* La variabile `ruolo` inizializzata con il ruolo del giocatore (se sconosciuto, un ruolo qualsiasi fra attaccante/difensore/portiere);
* La variabile `figurina` inizializzata con il link ad una immagine del giocatore reperita in rete.

**Azione richiesta:** Stampare tramite codice PHP una pagina HTML che contenga un'intestazione di presentazione del vostro giocatore preferito automatizzata in modo che il nome sia visualizzato grazie alla variabile (esempio: *"Il mio giocatore preferito è..."*). Aggiungere un paragrafo che descriva brevemente il giocatore utilizzando sempre le automatizzazioni tramite variabili (esempio: *"Nella squadra X gioca Y con numero di maglia Z e il suo ruolo è..."*). Infine andrà visualizzata anche un'immagine del giocatore sfruttando la variabile con il link alla risorsa in rete.

---

## Punto 2

Dichiarare e creare un array contenente 5 giocatori diversi (ognuno con i suoi dati relativi a nome, numero, eccetera). Nel caso dovesse risultare difficile (perdita di tempo) pensare o anche inventare 5 giocatori diversi, sarà sufficiente popolare l'array con dati a caso, purché venga conservato il campo del ruolo (attaccante/difensore/portiere).

**Azione richiesta:** Stampare tramite codice PHP una pagina HTML che contenga una presentazione per ogni giocatore (simile al paragrafo del punto precedente), ma tutto questo grazie ad un ciclo che naviga interamente l'array stampando per ogni giocatore la sua presentazione. 

Si chiede l'accortezza di stampare il campo del ruolo con colori diversi a seconda del valore, con l'aiuto di un file CSS esterno e di uno `span` con classe da automatizzare all'interno del paragrafo:
* **Rosso** per l'attaccante
* **Verde** per il difensore
* **Blu** per il portiere

> **Nota bene:** Per questo punto si può usare indifferentemente un ciclo `for` o un ciclo `foreach`.
> 
> **Nota bene 2:** Il controllo del ruolo, al fine di colorare in maniera diversa il campo relativo all'interno della presentazione, si può implementare a piacere: tramite funzione che restituisce un valore da assegnare alla classe o tramite condizione all'interno del codice.

---

## Punto 3

Stampare tramite codice PHP una pagina HTML che contenga una tabella automatizzata, con layout simile a quello della tabella riprodotta nell'immagine allegata.

> **Nota bene:** Per questo punto si DEVE usare necessariamente il ciclo `foreach` e sarà d'aiuto riciclare l'array dichiarato e popolato nel punto 2.
> 
> **Nota bene 2:** Il controllo del ruolo, particolarità richiesta al punto 2, DEVE essere necessariamente automatizzato con una funzione che restituisce il valore da assegnare alla classe.
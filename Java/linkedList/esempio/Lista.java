public class Lista {

    private Nodo testa;


    public Lista() {
        testa = null;
    }

    // INSERIMENTO IN TESTA
    public void inserisciInTesta(int valore) {

        Nodo nuovo = new Nodo(valore);
        nuovo.setNext(testa);
        testa = nuovo;
    }

    // INSERIMENTO IN CODA
    public void inserisciInCoda(int valore) {

        Nodo nuovo = new Nodo(valore);
        if (testa == null) {
            testa = nuovo;
        } else {
            Nodo corrente = testa;
            while (corrente.getNext() != null) {
                corrente = corrente.getNext();
            }
            corrente.setNext(nuovo);
        }
    }

    // STAMPA LISTA
    public void stampa() {
        
        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println(corrente.getDato());
            corrente = corrente.getNext();
        }
    }

    // CONTA ELEMENTI
    public int contaElementi() {

        int contatore = 0;
        Nodo corrente = testa;
        while (corrente != null) {
            contatore++;
            corrente = corrente.getNext();
        }
        return contatore;
    }

    // CERCA ELEMENTO
    public boolean cerca(int valore) {

        Nodo corrente = testa;
        while (corrente != null) {
            if (corrente.getDato() == valore) {
                return true;
            }
            corrente = corrente.getNext();
        }
        return false;
    }

    //inserimento in posizione random
    public void inserisciInPosizione(int valore, int posizione) {

        Nodo nuovo = new Nodo(valore);
        
        // Lista vuota oppure inserimento in testa
        if (posizione <= 0 || testa == null) {
            nuovo.setNext(testa);
            testa = nuovo;
            return;
        }
    
    
        Nodo corrente = testa;
        int indice = 0;   
        
        // Arrivo al nodo precedente alla posizione richiesta
        while (corrente.getNext() != null && indice < posizione - 1) {
            corrente = corrente.getNext();
            indice++;  
        }
    
        // Collegamenti
        nuovo.setNext(corrente.getNext());
        corrente.setNext(nuovo);
    }
    
}

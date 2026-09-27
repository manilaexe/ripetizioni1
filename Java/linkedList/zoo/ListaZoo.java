package zoo;

import java.util.NoSuchElementException;

public class ListaZoo {

    private Nodo<Animal> testa;


    public ListaZoo() {
        testa = null;
    }


    public void inserisciInTesta(Animal x) {

        Nodo<Animal> nuovo = new Nodo<>(x);

        nuovo.setNext(testa);

        testa = nuovo;
    }


    public void inserisciInCoda(Animal x) {

        Nodo<Animal> nuovo = new Nodo<>(x);

        if (testa == null) {
            testa = nuovo;
            return;
        }

        Nodo<Animal> corrente = testa;

        while (corrente.getNext() != null) {
            corrente = corrente.getNext();
        }

        corrente.setNext(nuovo);
    }


    public void inserisciInPosizione(Animal x, int pos) {

        if (pos <= 0 || testa == null) {
            inserisciInTesta(x);
            return;
        }

        Nodo<Animal> corrente = testa;
        int indice = 0;

        while (corrente.getNext() != null && indice < pos - 1) {
            corrente = corrente.getNext();
            indice++;
        }

        Nodo<Animal> nuovo = new Nodo<>(x);

        nuovo.setNext(corrente.getNext());
        corrente.setNext(nuovo);
    }


    public Animal estraiDaTesta() throws NoSuchElementException {

        if (testa == null)
            throw new NoSuchElementException();

        return testa.getDato();
    }


    public Animal estraiDaCoda() throws NoSuchElementException {

        if (testa == null)
            throw new NoSuchElementException();

        Nodo<Animal> corrente = testa;

        while (corrente.getNext() != null) {
            corrente = corrente.getNext();
        }

        return corrente.getDato();
    }


    public Animal estraiDaPosizione(int indice) throws NoSuchElementException {

        if (testa == null)
            throw new NoSuchElementException();


        Nodo<Animal> corrente = testa;
        int i = 0;


        while (corrente != null) {

            if (i == indice)
                return corrente.getDato();

            corrente = corrente.getNext();
            i++;
        }


        throw new NoSuchElementException();
    }


    public Animal estraiDaNome(String nome) throws NoSuchElementException {

        Nodo<Animal> corrente = testa;


        while (corrente != null) {

            if (corrente.getDato().getNome().equalsIgnoreCase(nome))
                return corrente.getDato();

            corrente = corrente.getNext();
        }


        throw new NoSuchElementException();
    }


    public void stampaNomi() {

        Nodo<Animal> corrente = testa;


        while (corrente != null) {

            System.out.println(corrente.getDato().getNome());

            corrente = corrente.getNext();
        }

    }


    public void stampaVersi() {

        Nodo<Animal> corrente = testa;


        while (corrente != null) {

            corrente.getDato().faiVerso();

            corrente = corrente.getNext();
        }

    }


    public ListaZoo piuGiovaniDi(double eta) {

        ListaZoo nuova = new ListaZoo();

        Nodo<Animal> corrente = testa;


        while (corrente != null) {

            if (corrente.getDato().getEta() < eta) {
                nuova.inserisciInCoda(corrente.getDato());
            }

            corrente = corrente.getNext();
        }


        return nuova;
    }


}

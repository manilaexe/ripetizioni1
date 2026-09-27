package zoo;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaZoo {

    private ArrayList<Animal> lista;

    public ListaZoo() {
        lista = new ArrayList<>();
    }

    public void inserisciInCoda(Animal x) {
        lista.add(x);
    }

    public void inserisciInTesta(Animal x) {
        lista.add(0, x);
    }

    public void inserisciInPosizione(Animal x, int pos) {
        if (pos < 0 || pos > lista.size()) {
            lista.add(x);
        } else {
            lista.add(pos, x);
        }
    }

    public Animal estraiDaTesta() throws NoSuchElementException {
        if (lista.isEmpty()) throw new NoSuchElementException();
        return lista.remove(0);
    }

    public Animal estraiDaCoda() throws NoSuchElementException {
        if (lista.isEmpty()) throw new NoSuchElementException();
        return lista.remove(lista.size() - 1);
    }

    public Animal estraiDaPosizione(int indice) throws NoSuchElementException {
        if (indice < 0 || indice >= lista.size()) throw new NoSuchElementException();
        return lista.remove(indice);
    }

    public Animal estraiDaNome(String nome) throws NoSuchElementException {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                return lista.remove(i);
            }
        }

        throw new NoSuchElementException();
    }

    public void stampaNomi() {
        for (Animal a : lista) {
            System.out.println(a.getNome());
        }
    }

    public void stampaVersi() {
        for (Animal a : lista) {
            a.faiVerso();
        }
    }

    public ListaZoo piuGiovaniDi(double eta) {

        ListaZoo nuova = new ListaZoo();

        for (Animal a : lista) {
            if (a.getEta() < eta) {
                nuova.inserisciInCoda(a);
            }
        }

        return nuova;
    }

}

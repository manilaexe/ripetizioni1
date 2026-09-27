import java.util.ArrayList;

public class Parcheggio {

    private ArrayList<Veicolo> veicoli;

    public Parcheggio() {
        veicoli = new ArrayList<>();
    }

    public void parcheggia(Veicolo v) {
        veicoli.add(v);
    }

    public Veicolo cercaPerTarga(String targa) {

        for (Veicolo v : veicoli) {

            if (v.getTarga().equalsIgnoreCase(targa)) {
                return v;
            }

        }

        return null;
    }

    public Veicolo cercaPerPosizione(int posizione) {

        if (posizione >= 0 && posizione < veicoli.size()) {
            return veicoli.get(posizione);
        }

        return null;
    }

    public void stampaVeicoli() {

        for (Veicolo v : veicoli) {
            System.out.println(v);
        }

    }

    public void stampaClacson() {

        for (Veicolo v : veicoli) {
            v.suonaClacson();
        }

    }

    public ArrayList<Veicolo> soloAutoElettriche() {

        ArrayList<Veicolo> lista = new ArrayList<>();

        for (Veicolo v : veicoli) {

            if (v instanceof Auto) {

                Auto a = (Auto) v;

                if (a.isElettrica()) {
                    lista.add(a);
                }

            }

        }

        return lista;
    }

    public int contaMoto() {

        int contatore = 0;

        for (Veicolo v : veicoli) {

            if (v instanceof Moto) {
                contatore++;
            }

        }

        return contatore;
    }

    public int contaAuto() {

        int contatore = 0;

        for (Veicolo v : veicoli) {

            if (v instanceof Auto) {
                contatore++;
            }

        }

        return contatore;
    }

}
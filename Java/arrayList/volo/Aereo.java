import java.util.ArrayList;

public class Aereo {

    private String codice;
    private String modello;
    private int capacitaMassima;
    private ArrayList<Persona> persone;


    public Aereo(String codice, String modello, int capacitaMassima) {

        this.codice = codice;
        this.modello = modello;
        this.capacitaMassima = capacitaMassima;
        this.persone = new ArrayList<>();

    }


    public String getCodice() {
        return codice;
    }


    public void setCodice(String codice) {
        this.codice = codice;
    }


    public String getModello() {
        return modello;
    }


    public void setModello(String modello) {
        this.modello = modello;
    }


    public int getCapacitaMassima() {
        return capacitaMassima;
    }


    public ArrayList<Persona> getPersone() {
        return persone;
    }


    public void aggiungiPersona(Persona p) throws AereoPienoException {

        if (persone.size() >= capacitaMassima) {

            throw new AereoPienoException("Aereo pieno");

        }

        persone.add(p);

    }


    public void rimuoviPersona(Persona p) {

        persone.remove(p);

    }


    public int contaPasseggeri() {

        int contatore = 0;


        for (Persona p : persone) {

            if (p instanceof Passeggero) {

                contatore++;

            }

        }

        return contatore;

    }


    public int contaPersonale() {

        int contatore = 0;


        for (Persona p : persone) {

            if (p instanceof Personale) {

                contatore++;

            }

        }

        return contatore;

    }


    public void stampaPersone() {

        for (Persona p : persone) {

            System.out.println(p);

        }

    }


    @Override
    public String toString() {

        return "Aereo codice: " + codice +
                ", modello: " + modello +
                ", persone a bordo: " + persone.size() +
                "/" + capacitaMassima;

    }

}

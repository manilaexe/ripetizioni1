public class CorsoYoga extends Corso implements Prenotabile {

    private String livello;

    public CorsoYoga(String codice, String nome, int durata,
                     int postiMassimi, String livello) {

        super(codice, nome, durata, postiMassimi);

        this.livello = livello;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    @Override
    public void tipoCorso() {
        System.out.println("Corso di Yoga");
    }

    @Override
    public void prenota(Iscritto iscritto)
            throws CorsoPienoException, AbbonamentoNonValidoException {

        if (!iscritto.puoFrequentare()) {
            throw new AbbonamentoNonValidoException(
                    "L'abbonamento dell'iscritto non è attivo"
            );
        }

        if (getIscritti().size() >= getPostiMassimi()) {
            throw new CorsoPienoException(
                    "Il corso è pieno"
            );
        }

        if (!getIscritti().contains(iscritto)) {
            getIscritti().add(iscritto);
        }
    }

    @Override
    public void cancella(Iscritto iscritto) {

        if (getIscritti().remove(iscritto)) {
            iscritto.terminaCorso();
        }
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Livello: " + livello;
    }
}
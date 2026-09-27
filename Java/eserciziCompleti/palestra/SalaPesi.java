public class SalaPesi extends Corso implements Prenotabile {

    private int macchinari;

    public SalaPesi(String codice, String nome, int durata,
                    int postiMassimi, int macchinari) {

        super(codice, nome, durata, postiMassimi);

        this.macchinari = macchinari;
    }

    public int getMacchinari() {
        return macchinari;
    }

    public void setMacchinari(int macchinari) {
        this.macchinari = macchinari;
    }

    @Override
    public void tipoCorso() {
        System.out.println("Sala Pesi");
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
                ", Macchinari: " + macchinari;
    }
}
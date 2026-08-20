public class Iscritto extends Persona {

    private String numeroTessera;
    private boolean abbonamentoAttivo;
    private int corsiFrequentati;

    public Iscritto(String nome, int eta, String email,
                    String numeroTessera, boolean abbonamentoAttivo)
            throws EtaNonValidaException {

        super(nome, eta, email);

        this.numeroTessera = numeroTessera;
        this.abbonamentoAttivo = abbonamentoAttivo;
        this.corsiFrequentati = 0;
    }

    public String getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(String numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public boolean isAbbonamentoAttivo() {
        return abbonamentoAttivo;
    }

    public void setAbbonamentoAttivo(boolean abbonamentoAttivo) {
        this.abbonamentoAttivo = abbonamentoAttivo;
    }

    public int getCorsiFrequentati() {
        return corsiFrequentati;
    }

    public void iscriviAlCorso() {
        corsiFrequentati++;
    }

    public void terminaCorso() {

        if (corsiFrequentati > 0) {
            corsiFrequentati--;
        }
    }

    public boolean puoFrequentare() {
        return abbonamentoAttivo;
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Numero tessera: " + numeroTessera +
                ", Abbonamento attivo: " + abbonamentoAttivo +
                ", Corsi frequentati: " + corsiFrequentati;
    }
}
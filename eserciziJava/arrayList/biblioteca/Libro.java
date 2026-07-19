public abstract class Libro {

    private String codice;
    private String titolo;
    private String autore;
    private boolean inPrestito;

    public Libro(String codice, String titolo, String autore) {

        this.codice = codice;
        this.titolo = titolo;
        this.autore = autore;
        this.inPrestito = false;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public boolean isInPrestito() {
        return inPrestito;
    }

    public void setInPrestito(boolean inPrestito) {
        this.inPrestito = inPrestito;
    }

    @Override
    public String toString() {

        return "Codice: " + codice +
                ", Titolo: " + titolo +
                ", Autore: " + autore +
                ", In prestito: " + inPrestito;
    }

    public abstract void tipoLibro();

}
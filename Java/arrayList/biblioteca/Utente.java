public class Utente extends Persona {

    private String numeroTessera;
    private int libriInPrestito;
    private boolean tesseraAttiva;

    public Utente(String nome, int eta, String email,
                  String numeroTessera, boolean tesseraAttiva)
            throws EtaNonValidaException {

        super(nome, eta, email);

        this.numeroTessera = numeroTessera;
        this.tesseraAttiva = tesseraAttiva;
        this.libriInPrestito = 0;
    }

    public String getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(String numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public int getLibriInPrestito() {
        return libriInPrestito;
    }

    public boolean isTesseraAttiva() {
        return tesseraAttiva;
    }

    public void setTesseraAttiva(boolean tesseraAttiva) {
        this.tesseraAttiva = tesseraAttiva;
    }

    public void prendiLibro() {

        libriInPrestito++;

    }

    public void restituisciLibro() {

        if (libriInPrestito > 0) {
            libriInPrestito--;
        }

    }

    public boolean puoPrendereLibro() {

        return tesseraAttiva && libriInPrestito < 3;

    }

    @Override
    public String toString() {

        return super.toString() +
                ", Tessera: " + numeroTessera +
                ", Libri in prestito: " + libriInPrestito +
                ", Tessera attiva: " + tesseraAttiva;
    }

}
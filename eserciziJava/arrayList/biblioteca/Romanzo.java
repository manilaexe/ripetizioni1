public class Romanzo extends Libro implements Prestabile {

    private String genere;

    public Romanzo(String codice, String titolo, String autore, String genere) {

        super(codice, titolo, autore);
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public void presta() {

        setInPrestito(true);

    }

    @Override
    public void restituisci() {

        setInPrestito(false);

    }

    @Override
    public void tipoLibro() {

        System.out.println("Romanzo");

    }

    @Override
    public String toString() {

        return super.toString() +
                ", Genere: " + genere;
    }

}
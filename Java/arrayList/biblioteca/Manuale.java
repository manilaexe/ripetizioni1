public class Manuale extends Libro implements Prestabile {

    private String materia;

    public Manuale(String codice, String titolo, String autore, String materia) {

        super(codice, titolo, autore);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
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

        System.out.println("Manuale");

    }

    @Override
    public String toString() {

        return super.toString() +
                ", Materia: " + materia;
    }

}
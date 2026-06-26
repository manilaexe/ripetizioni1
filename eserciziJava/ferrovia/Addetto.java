public abstract class Addetto extends Persona implements Personale {

    protected double bustaPaga;

    public Addetto(String nome, int anni, String email, double bustaPaga) {
        super(nome, anni, email);
        this.bustaPaga = bustaPaga;
    }

    public double getBustaPaga() {
        return bustaPaga;
    }

    public void setBustaPaga(double bustaPaga) {
        this.bustaPaga = bustaPaga;
    }

    @Override
    public String toString() {
        return "Impiegato delle ferrovie: " + super.toString();
    }
}

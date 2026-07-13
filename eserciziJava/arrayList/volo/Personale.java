public abstract class Personale extends Persona {

    private String matricola;
    private double stipendioBase;


    public Personale(String nome, int eta, String email,
                     String matricola, double stipendioBase)
            throws EtaNonValidaException {

        super(nome, eta, email);

        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
    }


    public String getMatricola() {
        return matricola;
    }


    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }


    public double getStipendioBase() {
        return stipendioBase;
    }


    public void setStipendioBase(double stipendioBase) {
        this.stipendioBase = stipendioBase;
    }


    @Override
    public String toString() {

        return super.toString() +
                ", matricola: " + matricola +
                ", stipendio: " + stipendioBase;
    }

}

public class Auto extends Veicolo implements Parcheggiabile {

    private boolean elettrica;

    public Auto(String targa, String marca, String modello, boolean elettrica) {
        super(targa, marca, modello);
        this.elettrica = elettrica;
    }

    public boolean isElettrica() {
        return elettrica;
    }

    public void setElettrica(boolean elettrica) {
        this.elettrica = elettrica;
    }

    @Override
    public void suonaClacson() {
        System.out.println("Bip Bip!");
    }

    @Override
    public void entra() {
        System.out.println("L'auto è entrata nel parcheggio.");
    }

    @Override
    public void esci() {
        System.out.println("L'auto è uscita dal parcheggio.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Elettrica: " + elettrica;
    }
}

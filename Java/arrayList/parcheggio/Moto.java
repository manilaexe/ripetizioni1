public class Moto extends Veicolo implements Parcheggiabile {

    private boolean cavallettoAbbassato;

    public Moto(String targa, String marca, String modello, boolean cavallettoAbbassato) {
        super(targa, marca, modello);
        this.cavallettoAbbassato = cavallettoAbbassato;
    }

    public boolean isCavallettoAbbassato() {
        return cavallettoAbbassato;
    }

    public void setCavallettoAbbassato(boolean cavallettoAbbassato) {
        this.cavallettoAbbassato = cavallettoAbbassato;
    }

    @Override
    public void suonaClacson() {
        System.out.println("Meeep!");
    }

    @Override
    public void entra() {
        System.out.println("La moto è entrata nel parcheggio.");
    }

    @Override
    public void esci() {
        System.out.println("La moto è uscita dal parcheggio.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cavalletto abbassato: " + cavallettoAbbassato;
    }

}

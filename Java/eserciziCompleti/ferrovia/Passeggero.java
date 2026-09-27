public class Passeggero extends Persona {

    private boolean biglietto;
    private boolean senior;
    private boolean junior;

    public Passeggero(String nome, int anni, String email) {
        super(nome, anni, email);

        // Inizialmente tutti false
        biglietto = false;
        senior = false;
        junior = false;

        // Determina automaticamente lo stato del passeggero
        setJunior(getAnni());
        setSenior(getAnni());
    }

    public boolean isBiglietto() {
        return biglietto;
    }

    public boolean isSenior() {
        return senior;
    }

    public boolean isJunior() {
        return junior;
    }

    public void setJunior(int anni) {

        if (anni < 13) {
            junior = true;
            senior = false;
            biglietto = true;
        }

    }


    public void setSenior(int anni) {

        if (anni > 59) {
            senior = true;
            junior = false;
            biglietto = true;
        }

    }


    // Metodo per pagare il biglietto
    public void paga() {

        if (!junior && !senior) {
            biglietto = true;
        }

    }

    @Override
    public String toString() {

        String stato;

        if (junior) {
            stato = "Il passeggero è sotto il limite d'età quindi viaggia gratis.";
        } else if (senior) {
            stato = "Il passeggero è oltre il limite d'età quindi viaggia gratis.";
        } else if (biglietto) {
            stato = "Il passeggero possiede il titolo di viaggio.";
        } else {
            stato = "Il passeggero NON possiede il titolo di viaggio.";
        }

        return "Passeggero: " + super.toString() + ". " + stato;

    }

}

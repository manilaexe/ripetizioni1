import java.time.LocalDateTime;

public class Controllore extends Addetto {

    private double stipendioTotale;

    public Controllore(String nome, int anni, String email, double bustaPaga) {
        super(nome, anni, email, bustaPaga);
        this.stipendioTotale = 0;
    }

    @Override
    public void timbraCartellino() {
        System.out.println("Timbro: " + LocalDateTime.now());
    }

    @Override
    public void riceviStipendio() {
        stipendioTotale += bustaPaga;
    }

    public double getStipendioTotale() {
        return stipendioTotale;
    }

    public String controlloBiglietto(Treno freccia) {

        int junior = 0;
        int senior = 0;
        int adultiConBiglietto = 0;
        int adultiSenzaBiglietto = 0;

        for (Persona p : freccia.getPersone()) {

            if (p == null) continue;

            if (p instanceof Passeggero) {

                Passeggero passeggero = (Passeggero) p;

                if (passeggero.isJunior()) {
                    junior++;
                } 
                else if (passeggero.isSenior()) {
                    senior++;
                } 
                else {
                    if (passeggero.isBiglietto()) {
                        adultiConBiglietto++;
                    } else {
                        adultiSenzaBiglietto++;
                    }
                }
            }
        }

        return "=== STATISTICHE TRENO ===\n"
                + "Junior: " + junior + "\n"
                + "Senior: " + senior + "\n"
                + "Adulti con biglietto: " + adultiConBiglietto + "\n"
                + "Adulti senza biglietto: " + adultiSenzaBiglietto;
    }


    public void fischia(Treno freccia) {

        int controllori = 0;

        for (Persona p : freccia.getPersone()) {

            if (p instanceof Controllore) {
                controllori++;
            }

            if (p instanceof Passeggero) {
                Passeggero passeggero = (Passeggero) p;

                if (!passeggero.isBiglietto()) {
                    System.out.println("Il treno NON può partire: passeggeri senza biglietto.");
                    return;
                }
            }
        }

        if (controllori < 2) {
            System.out.println("Il treno NON può partire: meno di 2 controllori.");
            return;
        }

        System.out.println("Il treno può partire! Fischio di partenza!");
    }


    // =======================
    // TOSTRING
    // =======================

    @Override
    public String toString() {
        return super.toString() + ". Mansione: Controllore.";
    }
}

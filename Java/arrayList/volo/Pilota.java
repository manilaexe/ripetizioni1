import java.time.LocalDateTime;

public class Pilota extends Personale implements Operatore {

    private int oreVolo;
    private String grado;


    public Pilota(String nome, int eta, String email,
                  String matricola, double stipendioBase,
                  int oreVolo, String grado)
            throws EtaNonValidaException {

        super(nome, eta, email, matricola, stipendioBase);

        this.oreVolo = oreVolo;
        this.grado = grado;
    }


    public int getOreVolo() {
        return oreVolo;
    }


    public void setOreVolo(int oreVolo) {
        this.oreVolo = oreVolo;
    }


    public String getGrado() {
        return grado;
    }


    public void setGrado(String grado) {
        this.grado = grado;
    }


    @Override
    public void timbraEntrata() {

        System.out.println("Entrata pilota: " + LocalDateTime.now());

    }


    @Override
    public void timbraUscita() {

        System.out.println("Uscita pilota: " + LocalDateTime.now());

    }


    public boolean abilitato() {

        return oreVolo >= 500;

    }


    @Override
    public String toString() {

        return "Pilota: " +
                super.toString() +
                ", ore volo: " + oreVolo +
                ", grado: " + grado;
    }

}

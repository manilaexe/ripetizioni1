import java.time.LocalDateTime;

public class AssistenteDiVolo extends Personale implements Operatore {

    private int voliEffettuati;
    private String lingua;


    public AssistenteDiVolo(String nome, int eta, String email,
                            String matricola, double stipendioBase,
                            int voliEffettuati, String lingua)
            throws EtaNonValidaException {

        super(nome, eta, email, matricola, stipendioBase);

        this.voliEffettuati = voliEffettuati;
        this.lingua = lingua;
    }


    public int getVoliEffettuati() {
        return voliEffettuati;
    }


    public void setVoliEffettuati(int voliEffettuati) {
        this.voliEffettuati = voliEffettuati;
    }


    public String getLingua() {
        return lingua;
    }


    public void setLingua(String lingua) {
        this.lingua = lingua;
    }


    @Override
    public void timbraEntrata() {

        System.out.println("Entrata assistente: " + LocalDateTime.now());

    }


    @Override
    public void timbraUscita() {

        System.out.println("Uscita assistente: " + LocalDateTime.now());

    }


    @Override
    public String toString() {

        return "Assistente di volo: " +
                super.toString() +
                ", voli effettuati: " + voliEffettuati +
                ", lingua: " + lingua;
    }

}

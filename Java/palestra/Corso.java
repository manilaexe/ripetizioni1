import java.util.ArrayList;

public abstract class Corso {

    private String codice;
    private String nome;
    private int durata;
    private int postiMassimi;
    private ArrayList<Iscritto> iscritti;

    public Corso(String codice, String nome, int durata, int postiMassimi) {

        this.codice = codice;
        this.nome = nome;
        this.durata = durata;
        this.postiMassimi = postiMassimi;
        this.iscritti = new ArrayList<>();
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getPostiMassimi() {
        return postiMassimi;
    }

    public void setPostiMassimi(int postiMassimi) {
        this.postiMassimi = postiMassimi;
    }

    public ArrayList<Iscritto> getIscritti() {
        return iscritti;
    }

    public abstract void tipoCorso();

    @Override
    public String toString() {

        return "Codice: " + codice +
                ", Nome: " + nome +
                ", Durata: " + durata + " minuti" +
                ", Posti: " + iscritti.size() +
                "/" + postiMassimi;
    }
}
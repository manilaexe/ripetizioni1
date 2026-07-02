package zoo;

public abstract class Animal {

    private String nome;
    private double eta;

    public Animal() {
        this.nome = "";
        this.eta = 0;
    }

    public Animal(String nome, double eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEta() {
        return eta;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }

    public abstract void mangia();
    public abstract void muoviti();
    public abstract void faiVerso();
}

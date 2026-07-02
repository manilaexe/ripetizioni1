package zoo;

public abstract class Quadrupede extends Animal {

    public Quadrupede() {
        super();
    }

    public Quadrupede(String nome, double eta) {
        super(nome, eta);
    }

    @Override
    public void muoviti() {
        System.out.println("Vado a 4 zampe...");
    }

}

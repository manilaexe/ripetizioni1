package zoo;

public class Cane extends Quadrupede implements Domestico {

    public Cane() {
        super();
    }

    public Cane(String nome, double eta) {
        super(nome, eta);
    }

    @Override
    public void mangia() {
        System.out.println("Mangio ossa...");
    }

    @Override
    public void faiVerso() {
        System.out.println("Bau!");
    }

    @Override
    public void eseguiComando() {
        System.out.println("Seduto!");
    }

}

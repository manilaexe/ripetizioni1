package zoo;

public class Gatto extends Quadrupede implements Domestico {

    public Gatto() {
        super();
    }

    public Gatto(String nome, double eta) {
        super(nome, eta);
    }

    @Override
    public void mangia() {
        System.out.println("Bevo latte...");
    }

    @Override
    public void faiVerso() {
        System.out.println("Miao!");
    }

    @Override
    public void eseguiComando() {
        System.out.println("Anche no!");
    }

}

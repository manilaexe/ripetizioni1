class Cane extends Animale {

    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println(nome + ": Bau Bau!");
    }
}

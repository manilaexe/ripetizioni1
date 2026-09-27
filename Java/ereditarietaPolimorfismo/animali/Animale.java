class Animale {
    protected String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void verso() {
        System.out.println("L'animale fa un verso");
    }

    public String getNome() {
        return nome;
    }
}

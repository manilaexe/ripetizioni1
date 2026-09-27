class Manager extends Dipendente {

    public Manager(String nome) {
        super(nome);
    }

    @Override
    public double stipendio() {
        return 2000 + 500;
    }
}

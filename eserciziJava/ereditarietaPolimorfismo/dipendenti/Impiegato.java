class Impiegato extends Dipendente {

    public Impiegato(String nome) {
        super(nome);
    }

    @Override
    public double stipendio() {
        return 1200;
    }
}

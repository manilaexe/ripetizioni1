class Quadrato extends Figura {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double area() {
        return lato * lato;
    }
}

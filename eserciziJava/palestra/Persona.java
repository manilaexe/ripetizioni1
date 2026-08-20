public abstract class Persona {

    private String nome;
    private int eta;
    private String email;

    public Persona(String nome, int eta, String email)
            throws EtaNonValidaException {

        if (eta <= 0) {
            throw new EtaNonValidaException("Età non valida");
        }

        this.nome = nome;
        this.eta = eta;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta)
            throws EtaNonValidaException {

        if (eta <= 0) {
            throw new EtaNonValidaException("Età non valida");
        }

        this.eta = eta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Età: " + eta +
                ", Email: " + email;
    }
}
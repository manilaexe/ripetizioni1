public abstract class Persona {

    private String nome;
    private int anni;
    private String email;

    public Persona(String nome, int anni, String email) {

        this.nome = nome;
        this.email = email;

        if (anni >= 1) {
            this.anni = anni;
        } else {
            this.anni = 1;
            System.out.println("Età non valida. Impostata automaticamente a 1 anno.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getAnni() {
        return anni;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnni(int anni) {

        if (anni >= 1) {
            this.anni = anni;
        } else {
            System.out.println("Età non valida.");
        }

    }

    @Override
    public String toString() {
        return getNome() + ", età: " + getAnni() + " anni, indirizzo e-mail: " + getEmail();
    }

}

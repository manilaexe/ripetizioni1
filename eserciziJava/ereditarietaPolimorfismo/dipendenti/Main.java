public class Main {
    public static void main(String[] args) {
        Dipendente[] azienda = new Dipendente[2];

        azienda[0] = new Impiegato("Luca");
        azienda[1] = new Manager("Sara");

        for (Dipendente d : azienda) {
            System.out.println(d.nome + " stipendio: " + d.stipendio());
        }
    }
}

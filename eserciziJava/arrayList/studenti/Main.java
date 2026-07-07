import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Creazione dell'ArrayList
        ArrayList<Studente> studenti = new ArrayList<>();

        // Inserimento degli studenti
        studenti.add(new Studente("Marco", 7.5));
        studenti.add(new Studente("Anna", 5.5));
        studenti.add(new Studente("Luca", 8));
        studenti.add(new Studente("Sara", 6));
        studenti.add(new Studente("Giulia", 4.5));

        // Stampa di tutti gli studenti
        System.out.println("ELENCO STUDENTI");

        for (Studente s : studenti) {
            System.out.println(s);
        }

        // Stampa degli studenti promossi
        System.out.println("\nSTUDENTI CON VOTO MAGGIORE O UGUALE A 6");

        for (Studente s : studenti) {

            if (s.getVoto() >= 6) {
                System.out.println(s);
            }

        }

    }

}

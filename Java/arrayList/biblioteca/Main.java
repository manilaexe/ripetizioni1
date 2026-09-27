public class Main {

    public static void main(String[] args) {

        try {
            Biblioteca biblioteca = new Biblioteca(10, 10);

            Utente u1 = new Utente(
                    "Mario Rossi",
                    25,
                    "mario@email.com",
                    "T001",
                    true
            );

            Utente u2 = new Utente(
                    "Anna Bianchi",
                    40,
                    "anna@email.com",
                    "T002",
                    true
            );


            Romanzo r1 = new Romanzo(
                    "L001",
                    "Il Signore degli Anelli",
                    "Tolkien",
                    "Fantasy"
            );

            Romanzo r2 = new Romanzo(
                    "L002",
                    "1984",
                    "George Orwell",
                    "Distopico"
            );


            Manuale m1 = new Manuale(
                    "L003",
                    "Fondamenti di Java",
                    "Deitel",
                    "Informatica"
            );

            Manuale m2 = new Manuale(
                    "L004",
                    "Reti di Calcolatori",
                    "Tanenbaum",
                    "Reti"
            );

            biblioteca.aggiungiUtente(u1);
            biblioteca.aggiungiUtente(u2);
            biblioteca.aggiungiLibro(r1);
            biblioteca.aggiungiLibro(r2);
            biblioteca.aggiungiLibro(m1);
            biblioteca.aggiungiLibro(m2);

            System.out.println("LIBRI PRESENTI:");
            biblioteca.stampaLibri();

            System.out.println("\nUTENTI REGISTRATI:");
            biblioteca.stampaUtenti();
            
			System.out.println("\nRICERCA LIBRO:");
            Libro trovato = biblioteca.cercaLibro("L001");

            System.out.println(trovato);
            System.out.println("\nEFFETTUO PRESTITO:");

            biblioteca.effettuaPrestito("L001", "T001");

            System.out.println("Prestito effettuato");

            System.out.println("\nLIBRI DISPONIBILI:");
            System.out.println(
                    biblioteca.contaDisponibili()
            );

            System.out.println("\nLIBRI IN PRESTITO:");
            System.out.println(
                    biblioteca.contaPrestati()
            );

            System.out.println("\nROMANZI:");
            biblioteca.stampaRomanzi();

            System.out.println("\nMANUALI:");
            biblioteca.stampaManuali();

            System.out.println("\nRESTITUZIONE:");
            biblioteca.restituzioneLibro("L001");

            System.out.println("Libro restituito");

            System.out.println("\nPROVA ERRORE PRESTITO:");

            biblioteca.effettuaPrestito("L001", "T002");


        } catch (EtaNonValidaException |
                 LibroNonDisponibileException |
                 LibroNonTrovatoException |
                 UtenteNonTrovatoException |
                 PrestitoNonConsentitoException e) {


            System.out.println(e.getMessage());

        }

    }

}
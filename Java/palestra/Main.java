public class Main {

    public static void main(String[] args) {

        try {

            Palestra palestra = new Palestra();

            Iscritto i1 = new Iscritto(
                    "Mario Rossi",
                    25,
                    "mario@email.com",
                    "T001",
                    true
            );

            Iscritto i2 = new Iscritto(
                    "Anna Bianchi",
                    32,
                    "anna@email.com",
                    "T002",
                    true
            );

            Iscritto i3 = new Iscritto(
                    "Luca Verdi",
                    19,
                    "luca@email.com",
                    "T003",
                    false
            );

            Iscritto i4 = new Iscritto(
                    "Sara Neri",
                    45,
                    "sara@email.com",
                    "T004",
                    true
            );

            palestra.aggiungiIscritto(i1);
            palestra.aggiungiIscritto(i2);
            palestra.aggiungiIscritto(i3);
            palestra.aggiungiIscritto(i4);


            SalaPesi sala1 = new SalaPesi(
                    "P001",
                    "Sala Pesi Principale",
                    60,
                    2,
                    15
            );

            SalaPesi sala2 = new SalaPesi(
                    "P002",
                    "Sala Pesi Avanzata",
                    90,
                    3,
                    20
            );

            CorsoYoga yoga1 = new CorsoYoga(
                    "Y001",
                    "Yoga Base",
                    60,
                    3,
                    "Principianti"
            );

            CorsoYoga yoga2 = new CorsoYoga(
                    "Y002",
                    "Yoga Avanzato",
                    90,
                    2,
                    "Avanzato"
            );

            palestra.aggiungiCorso(sala1);
            palestra.aggiungiCorso(sala2);
            palestra.aggiungiCorso(yoga1);
            palestra.aggiungiCorso(yoga2);


            System.out.println("===== ISCRITTI =====");

            palestra.stampaIscritti();


            System.out.println("\n===== CORSI =====");

            palestra.stampaCorsi();


            System.out.println("\n===== RICERCA ISCRITTO =====");

            Iscritto trovato = palestra.cercaIscritto("T001");

            System.out.println(trovato);


            System.out.println("\n===== RICERCA CORSO =====");

            Corso corso = palestra.cercaCorso("Y001");

            System.out.println(corso);


            System.out.println("\n===== PRENOTAZIONI =====");

            palestra.prenotaCorso("P001", "T001");
            System.out.println("Mario ha prenotato Sala Pesi");

            palestra.prenotaCorso("P001", "T002");
            System.out.println("Anna ha prenotato Sala Pesi");

            palestra.prenotaCorso("Y001", "T004");
            System.out.println("Sara ha prenotato Yoga");


            System.out.println("\n===== ISCRITTI ATTIVI =====");

            System.out.println(
                    palestra.contaIscrittiAttivi()
            );


            System.out.println("\n===== POSTI DISPONIBILI =====");

            System.out.println(
                    palestra.contaPostiDisponibili()
            );


            System.out.println("\n===== STATO CORSI =====");

            palestra.stampaCorsi();


            System.out.println("\n===== PROVA ABBONAMENTO NON VALIDO =====");

            palestra.prenotaCorso("Y002", "T003");


        } catch (EtaNonValidaException |
                 CorsoPienoException |
                 AbbonamentoNonValidoException |
                 IscrittoNonTrovatoException |
                 CorsoNonTrovatoException e) {

            System.out.println("ERRORE: " + e.getMessage());
        }
    }
}
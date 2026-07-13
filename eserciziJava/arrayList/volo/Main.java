public class Main {

    public static void main(String[] args) {

        try {

            CompagniaAerea compagnia = new CompagniaAerea();


            Passeggero p1 = new Passeggero(
                    "Mario Rossi",
                    35,
                    "mario@email.com",
                    "AA111"
            );

            Passeggero p2 = new Passeggero(
                    "Luca Bianchi",
                    8,
                    "luca@email.com",
                    "BB222"
            );

            Passeggero p3 = new Passeggero(
                    "Anna Verdi",
                    72,
                    "anna@email.com",
                    "CC333"
            );

            Passeggero p4 = new Passeggero(
                    "Marco Neri",
                    40,
                    "marco@email.com",
                    "DD444"
            );


            p1.acquistaBiglietto("Economy");
            p2.acquistaBiglietto("Economy");
            p3.acquistaBiglietto("Business");


            Pilota pilota1 = new Pilota(
                    "Giovanni Piloti",
                    45,
                    "pilota@email.com",
                    "P001",
                    5000,
                    1200,
                    "Comandante"
            );


            AssistenteDiVolo assistente1 = new AssistenteDiVolo(
                    "Sara Bianchi",
                    30,
                    "assistente@email.com",
                    "A001",
                    2000,
                    300,
                    "Inglese"
            );


            Aereo aereo1 = new Aereo(
                    "AZ100",
                    "Boeing 737",
                    10
            );


            Aereo aereo2 = new Aereo(
                    "AZ200",
                    "Airbus A320",
                    5
            );


            compagnia.aggiungiAereo(aereo1);
            compagnia.aggiungiAereo(aereo2);



            aereo1.aggiungiPersona(p1);
            aereo1.aggiungiPersona(p2);
            aereo1.aggiungiPersona(p3);
            aereo1.aggiungiPersona(pilota1);
            aereo1.aggiungiPersona(assistente1);



            aereo2.aggiungiPersona(p4);



            System.out.println("AEREI PRESENTI:");

            compagnia.stampaAerei();



            System.out.println("\nPERSONE SUL PRIMO AEREO:");

            aereo1.stampaPersone();



            System.out.println("\nSTATISTICHE PASSEGGERI:");

            System.out.println(
                    compagnia.controlloPasseggeri(aereo1)
            );



            System.out.println("\nTOTALE PASSEGGERI:");

            System.out.println(
                    compagnia.totalePasseggeri()
            );



            System.out.println("\nAEREO CON PIU PASSEGGERI:");

            System.out.println(
                    compagnia.aereoConPiuPasseggeri()
            );



            System.out.println("\nTENTATIVO DECOLLO:");

            boolean risultato = compagnia.decolla(aereo1);


            if (risultato) {

                System.out.println("L'aereo può decollare");

            } else {

                System.out.println("Decollo impossibile");

            }



            System.out.println("\nRICERCA AEREO:");

            Aereo trovato = compagnia.cercaAereo("AZ100");

            System.out.println(trovato);



        } catch (EtaNonValidaException |
                 BigliettoNonValidoException |
                 AereoPienoException |
                 AereoNonTrovatoException |
                 PilotaNonAbilitatoException e) {


            System.out.println(e.getMessage());

        }


    }

}

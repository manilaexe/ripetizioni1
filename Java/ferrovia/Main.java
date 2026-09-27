public class Main {

    public static void main(String[] args) {

        Passeggero p1 = new Passeggero("Mattia", 38, "matti@gino.com");
        Passeggero p2 = new Passeggero("Salvatore", 41, "salvo@gino.com");
        Controllore c1 = new Controllore("Annamaria", 53, "anna@gino.com", 1000);
        Controllore c2 = new Controllore("Vincenzo", 51, "cenzo@gino.com", 2000);
        Passeggero p3 = new Passeggero("Mario", 87, "supermario@gino.com");

        Treno freccia = new Treno();

        System.out.println(freccia.aBordo(p1));
        System.out.println(freccia.aBordo(p2));
        System.out.println(freccia.aBordo(c1));
        System.out.println(freccia.aBordo(c2));
        System.out.println(freccia.aBordo(p3));

        System.out.println();

        // Prendiamo un controllore per usare i metodi
        Controllore controllore = c1;

        System.out.println(controllore.controlloBiglietto(freccia));

        System.out.println();
        //tentativo di partena
        controllore.fischia(freccia);

        System.out.println();
        //prova stipendio
        c1.riceviStipendio();
        c2.riceviStipendio();

        System.out.println("Stipendio totale C1: " + c1.getStipendioTotale());
        System.out.println("Stipendio totale C2: " + c2.getStipendioTotale());
    }
}

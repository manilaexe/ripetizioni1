public class Main {

    public static void main(String[] args) {

        Parcheggio parcheggio = new Parcheggio();

        Auto a1 = new Auto("AB123CD", "Fiat", "Panda", false);
        Auto a2 = new Auto("EF456GH", "Tesla", "Model 3", true);

        Moto m1 = new Moto("IL789MN", "Yamaha", "MT-07", true);
        Moto m2 = new Moto("OP321QR", "Honda", "CB500", false);

        parcheggio.parcheggia(a1);
        parcheggio.parcheggia(a2);
        parcheggio.parcheggia(m1);
        parcheggio.parcheggia(m2);

        System.out.println("VEICOLI PRESENTI:");
        parcheggio.stampaVeicoli();

        System.out.println("\nRICERCA PER TARGA:");
        Veicolo trovato = parcheggio.cercaPerTarga("EF456GH");

        if (trovato != null) {
            System.out.println(trovato);
            trovato.suonaClacson();
            if (trovato instanceof Parcheggiabile) {
                Parcheggiabile p = (Parcheggiabile)trovato;
                p.entra();
                p.esci();
            }
        } else {
            System.out.println("Veicolo non trovato");
        }

        System.out.println("\nVEICOLO IN POSIZIONE 2:");
        Veicolo posizione = parcheggio.cercaPerPosizione(2);
        if (posizione != null) {
            System.out.println(posizione);
            posizione.suonaClacson();
        }

        System.out.println("\nNUMERO AUTO:");
        System.out.println(parcheggio.contaAuto());

        System.out.println("\nNUMERO MOTO:");
        System.out.println(parcheggio.contaMoto());

        System.out.println("\nTUTTI I CLACSON:");
        parcheggio.stampaClacson();

        System.out.println("\nAUTO ELETTRICHE:");
        for (Veicolo v : parcheggio.soloAutoElettriche()) {
            System.out.println(v);
        }
    }

}

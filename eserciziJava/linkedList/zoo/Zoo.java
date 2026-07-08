package zoo;

public class Zoo {

    public static void main(String[] args) {


        ListaZoo lista = new ListaZoo();


        Cane bob = new Cane("Bob", 3);
        Cane rex = new Cane("Rex", 5);

        Gatto mao = new Gatto("Mao", 1);
        Gatto red = new Gatto("Red", 4);



        lista.inserisciInCoda(bob);
        lista.inserisciInCoda(rex);
        lista.inserisciInCoda(mao);
        lista.inserisciInCoda(red);



        System.out.println("Nomi iniziali:");

        lista.stampaNomi();



        lista.inserisciInPosizione(new Gatto("Leonida", 2), 1);

        lista.inserisciInPosizione(new Cane("Luna", 1.5), 3);



        lista.inserisciInTesta(new Gatto("Marra", 6));

        lista.inserisciInCoda(new Cane("Dodo", 2));



        System.out.println("\nVerso posizione 4:");

        lista.estraiDaPosizione(4).faiVerso();



        System.out.println("\nVerso ultimo:");

        lista.estraiDaCoda().faiVerso();



        System.out.println("\nRicerca Mao:");

        try {

            Animal a = lista.estraiDaNome("Mao");

            System.out.println(a.getNome());

            a.mangia();
            a.muoviti();
            a.faiVerso();


        } catch (Exception e) {

            System.out.println("Animale non trovato");

        }



        System.out.println("\nRicerca Gaia:");

        try {

            Animal a = lista.estraiDaNome("Gaia");

            System.out.println(a.getNome());

        } catch (Exception e) {

            System.out.println("Animale non trovato");

        }



        System.out.println("\nTutti i versi:");

        lista.stampaVersi();



        System.out.println("\nAnimali sotto 2.5 anni:");

        ListaZoo giovani = lista.piuGiovaniDi(2.5);

        giovani.stampaNomi();

    }

}

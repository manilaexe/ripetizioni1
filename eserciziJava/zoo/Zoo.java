package zoo;

public class Zoo {

    public static void main(String[] args) {

        Animal c = new Cane("Fido", 5);
        Animal g = new Gatto("Micia", 3);

        c.faiVerso();
        g.faiVerso();

        Domestico cd = (Domestico) c;
        Domestico cg = (Domestico) g;

        cd.eseguiComando();
        cg.eseguiComando();

        ListaZoo zoo = new ListaZoo();

        zoo.inserisciInCoda(c);
        zoo.inserisciInCoda(g);

        Animal cane2 = new Cane("Rocky", 8);
        Animal gatto2 = new Gatto("Luna", 2);

        zoo.inserisciInTesta(cane2);
        zoo.inserisciInPosizione(gatto2, 1);

        System.out.println("\nNOMI:");
        zoo.stampaNomi();

        System.out.println("\nVERSI:");
        zoo.stampaVersi();

        System.out.println("\nESTRAZIONE PER NOME:");
        Animal estratto = zoo.estraiDaNome("Fido");
        System.out.println("Estratto: " + estratto.getNome());

        System.out.println("\nNUOVA LISTA (più giovani di 6 anni):");
        ListaZoo giovani = zoo.piuGiovaniDi(6);

        giovani.stampaNomi();
    }
}

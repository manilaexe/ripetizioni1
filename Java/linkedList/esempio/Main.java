public class Main {

    public static void main(String[] args) {


        Lista lista = new Lista();



        // Inserimento in testa

        lista.inserisciInTesta(20);
        lista.inserisciInTesta(10);



        // Inserimento in coda

        lista.inserisciInCoda(30);
        lista.inserisciInCoda(40);



        System.out.println("ELEMENTI DELLA LISTA:");

        lista.stampa();



        System.out.println();



        System.out.println("Numero elementi: "
                + lista.contaElementi());



        System.out.println();



        System.out.println("Cerco 30:");

        if (lista.cerca(30)) {

            System.out.println("Elemento trovato");

        } else {

            System.out.println("Elemento non trovato");

        }


    }

}

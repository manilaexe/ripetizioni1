package consumi;

public class Consumi {

    public static void main(String[] args) {
        Auto miaAuto = new Auto();
        System.out.println("Esercizio 1");
        miaAuto.calcolaConsumi();
        System.out.println("Esercizio 3");
        /*
        try {
            miaAuto.rifornisci("Metano",20);
        } catch(CarburanteErratoException e) {
            System.out.println(e.getMessage());
        }
         */
        System.out.println("Esercizio 4");
    }
}

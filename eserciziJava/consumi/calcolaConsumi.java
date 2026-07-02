public void calcolaConsumi() {

    Scanner tastiera = new Scanner(System.in);

    try {

        int kilometri, litri;

        System.out.print("Inserire i kilometri percorsi: ");
        kilometri = tastiera.nextInt();

        System.out.print("Inserire i litri di benzina consumati: ");
        litri = tastiera.nextInt();

        if (litri == 0) {
            throw new ArithmeticException();
        }

        km_l = (double) kilometri / litri;

        System.out.println("La tua auto fa " + km_l + " kilometri al litro");
        System.out.println("... fine dell'esercizio.");

    }
    catch (ArithmeticException e) {
        System.out.println("Sicuro che la tua auto non consumi carburante?");
    }
    catch (java.util.InputMismatchException e) {
        System.out.println("Devi inserire dei dati numerici validi");
    }
    catch (Exception e) {
        System.out.println("Errore imprevisto:");
        e.printStackTrace();
    }

}

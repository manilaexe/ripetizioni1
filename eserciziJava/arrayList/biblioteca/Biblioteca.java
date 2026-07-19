public class Biblioteca {

    private Libro[] libri;
    private Utente[] utenti;

    private int numLibri;
    private int numUtenti;

    public Biblioteca(int maxLibri, int maxUtenti) {

        libri = new Libro[maxLibri];
        utenti = new Utente[maxUtenti];
        numLibri = 0;
        numUtenti = 0;
    }

    public void aggiungiLibro(Libro libro) {

        if (numLibri < libri.length) {
            libri[numLibri] = libro;
            numLibri++;
        }

    }

    public void aggiungiUtente(Utente utente) {

        if (numUtenti < utenti.length) {
            utenti[numUtenti] = utente;
            numUtenti++;
        }

    }

    public Libro cercaLibro(String codice) throws LibroNonTrovatoException {

        for (int i = 0; i < numLibri; i++) {
            if (libri[i].getCodice().equalsIgnoreCase(codice)) {
                return libri[i];
            }
        }
        throw new LibroNonTrovatoException("Libro non trovato");
    }

    public Utente cercaUtente(String tessera) throws UtenteNonTrovatoException {

        for (int i = 0; i < numUtenti; i++) {
            if (utenti[i].getNumeroTessera().equalsIgnoreCase(tessera)) {
                return utenti[i];
            }
        }
        throw new UtenteNonTrovatoException("Utente non trovato");
    }

    public void stampaLibri() {

        for (int i = 0; i < numLibri; i++) {
            System.out.println(libri[i]);
        }
    }

    public void stampaUtenti() {

        for (int i = 0; i < numUtenti; i++) {
            System.out.println(utenti[i]);
        }

    }

    public int contaDisponibili() {

        int contatore = 0;

        for (int i = 0; i < numLibri; i++) {
            if (!libri[i].isInPrestito()) {
                contatore++;
            }
        }
        return contatore;
    }

    public int contaPrestati() {

        int contatore = 0;
        for (int i = 0; i < numLibri; i++) {
            if (libri[i].isInPrestito()) {
                contatore++;
            }
        }
        return contatore;
    }

    public void stampaRomanzi() {

        for (int i = 0; i < numLibri; i++) {
            if (libri[i] instanceof Romanzo) {
                System.out.println(libri[i]);
            }
        }
    }

    public void stampaManuali() {

        for (int i = 0; i < numLibri; i++) {
            if (libri[i] instanceof Manuale) {
                System.out.println(libri[i]);
            }
        }
    }

    public void effettuaPrestito(String codiceLibro, String numeroTessera)
            throws LibroNonTrovatoException,
            UtenteNonTrovatoException,
            LibroNonDisponibileException,
            PrestitoNonConsentitoException {

        Libro libro = cercaLibro(codiceLibro);
        Utente utente = cercaUtente(numeroTessera);

        if (libro.isInPrestito()) {
            throw new LibroNonDisponibileException("Libro non disponibile");
        }

        if (!utente.puoPrendereLibro()) {
            throw new PrestitoNonConsentitoException("Prestito non consentito");
        }

        Prestabile p = (Prestabile) libro;
        p.presta();

        utente.prendiLibro();

    }

    public void restituzioneLibro(String codiceLibro) throws LibroNonTrovatoException {

        Libro libro = cercaLibro(codiceLibro);
        Prestabile p = (Prestabile) libro;
        p.restituisci();
    }

}
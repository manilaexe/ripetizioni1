public interface Prenotabile {

    void prenota(Iscritto iscritto)
            throws CorsoPienoException, AbbonamentoNonValidoException;

    void cancella(Iscritto iscritto);

}
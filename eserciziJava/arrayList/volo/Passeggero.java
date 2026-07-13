public class Passeggero extends Persona {

    private String documento;
    private String classeBiglietto;
    private boolean bigliettoPagato;


    public Passeggero(String nome, int eta, String email, String documento) 
            throws EtaNonValidaException {

        super(nome, eta, email);

        this.documento = documento;
        this.classeBiglietto = "";
        this.bigliettoPagato = false;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getClasseBiglietto() {
        return classeBiglietto;
    }


    public boolean isBigliettoPagato() {
        return bigliettoPagato;
    }


    public void acquistaBiglietto(String classe) throws BigliettoNonValidoException {

        if (!classe.equalsIgnoreCase("Economy") &&
            !classe.equalsIgnoreCase("Business") &&
            !classe.equalsIgnoreCase("Prima Classe")) {

            throw new BigliettoNonValidoException("Classe biglietto non valida");
        }


        if (documento == null || documento.isEmpty()) {

            throw new BigliettoNonValidoException("Documento mancante");

        }


        this.classeBiglietto = classe;
        this.bigliettoPagato = true;
    }


    public boolean haBiglietto() {

        return bigliettoPagato;
    }


    public boolean isBambino() {

        return getEta() < 12;
    }


    public boolean isAnziano() {

        return getEta() > 65;
    }


    @Override
    public String toString() {

        return "Passeggero: " +
                super.toString() +
                ", documento: " + documento +
                ", classe: " + classeBiglietto +
                ", biglietto pagato: " + bigliettoPagato;
    }

}

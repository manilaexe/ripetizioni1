import java.util.ArrayList;

public class CompagniaAerea {

    private ArrayList<Aereo> aerei;


    public CompagniaAerea() {

        aerei = new ArrayList<>();

    }


    public ArrayList<Aereo> getAerei() {

        return aerei;

    }


    public void aggiungiAereo(Aereo aereo) {

        aerei.add(aereo);

    }


    public Aereo cercaAereo(String codice) throws AereoNonTrovatoException {

        for (Aereo a : aerei) {

            if (a.getCodice().equals(codice)) {

                return a;

            }

        }


        throw new AereoNonTrovatoException("Aereo non trovato");

    }


    public void stampaAerei() {

        for (Aereo a : aerei) {

            System.out.println(a);

        }

    }


    public Aereo aereoConPiuPasseggeri() {

        if (aerei.isEmpty()) {

            return null;

        }


        Aereo massimo = aerei.get(0);


        for (Aereo a : aerei) {

            if (a.contaPasseggeri() > massimo.contaPasseggeri()) {

                massimo = a;

            }

        }


        return massimo;

    }


    public int totalePasseggeri() {

        int totale = 0;


        for (Aereo a : aerei) {

            totale += a.contaPasseggeri();

        }


        return totale;

    }


    public boolean decolla(Aereo aereo) 
            throws PilotaNonAbilitatoException {


        boolean pilota = false;
        boolean assistente = false;


        for (Persona p : aereo.getPersone()) {


            if (p instanceof Pilota) {

                Pilota pil = (Pilota)p;


                if (pil.abilitato()) {

                    pilota = true;

                } else {

                    throw new PilotaNonAbilitatoException(
                            "Il pilota non è abilitato"
                    );

                }

            }


            if (p instanceof AssistenteDiVolo) {

                assistente = true;

            }

        }


        for (Persona p : aereo.getPersone()) {


            if (p instanceof Passeggero) {


                Passeggero pas = (Passeggero)p;


                if (!pas.haBiglietto()) {

                    return false;

                }

            }

        }


        return pilota && assistente;

    }


    public String controlloPasseggeri(Aereo aereo) {


        int bambini = 0;
        int anziani = 0;
        int adulti = 0;
        int senzaBiglietto = 0;


        for (Persona p : aereo.getPersone()) {


            if (p instanceof Passeggero) {


                Passeggero pas = (Passeggero)p;


                if (pas.isBambino()) {

                    bambini++;

                } else if (pas.isAnziano()) {

                    anziani++;

                } else {

                    adulti++;

                }


                if (!pas.haBiglietto()) {

                    senzaBiglietto++;

                }

            }

        }


        return "Bambini: " + bambini +
                "\nAnziani: " + anziani +
                "\nAdulti: " + adulti +
                "\nSenza biglietto: " + senzaBiglietto;

    }

}

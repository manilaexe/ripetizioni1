import java.util.ArrayList;

public class Palestra {

    private ArrayList<Iscritto> iscritti;
    private ArrayList<Corso> corsi;

    public Palestra() {

        iscritti = new ArrayList<>();
        corsi = new ArrayList<>();
    }

    public void aggiungiIscritto(Iscritto iscritto) {

        iscritti.add(iscritto);
    }

    public void aggiungiCorso(Corso corso) {

        corsi.add(corso);
    }

    public Iscritto cercaIscritto(String numeroTessera)
            throws IscrittoNonTrovatoException {

        for (Iscritto i : iscritti) {

            if (i.getNumeroTessera().equalsIgnoreCase(numeroTessera)) {
                return i;
            }
        }

        throw new IscrittoNonTrovatoException(
                "Iscritto non trovato"
        );
    }

    public Corso cercaCorso(String codice)
            throws CorsoNonTrovatoException {

        for (Corso c : corsi) {

            if (c.getCodice().equalsIgnoreCase(codice)) {
                return c;
            }
        }

        throw new CorsoNonTrovatoException(
                "Corso non trovato"
        );
    }

    public void stampaIscritti() {

        for (Iscritto i : iscritti) {
            System.out.println(i);
        }
    }

    public void stampaCorsi() {

        for (Corso c : corsi) {
            System.out.println(c);
        }
    }

    public int contaIscrittiAttivi() {

        int contatore = 0;

        for (Iscritto i : iscritti) {

            if (i.isAbbonamentoAttivo()) {
                contatore++;
            }
        }

        return contatore;
    }

    public int contaPostiDisponibili() {

        int posti = 0;

        for (Corso c : corsi) {

            posti += c.getPostiMassimi() - c.getIscritti().size();
        }

        return posti;
    }

    public void prenotaCorso(String codiceCorso, String numeroTessera)
            throws CorsoNonTrovatoException,
            IscrittoNonTrovatoException,
            CorsoPienoException,
            AbbonamentoNonValidoException {

        Corso corso = cercaCorso(codiceCorso);
        Iscritto iscritto = cercaIscritto(numeroTessera);

        int prima = corso.getIscritti().size();

        if (corso instanceof Prenotabile) {

            Prenotabile prenotabile = (Prenotabile) corso;

            prenotabile.prenota(iscritto);

            if (corso.getIscritti().size() > prima) {
                iscritto.iscriviAlCorso();
            }
        }
    }
}
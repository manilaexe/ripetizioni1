public class Treno {
  
    private Persona[] persone;
    private int postiOccupati;

    public Treno() {
        this.persone = new Persona[10];
        this.postiOccupati = 0;
    }

    public Persona[] getPersone() {
        return persone;
    }

    public String aBordo(Persona persona) {

        if (postiOccupati < persone.length) {
            persone[postiOccupati] = persona;
            postiOccupati++;
            return persona.getNome() + " è salito a bordo.";
        } else {
            return "Il treno è pieno.";
        }
    }
}

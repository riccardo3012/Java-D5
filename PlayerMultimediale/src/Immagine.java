
public class Immagine extends ElementoMultimediale {
    public int luminosita;

    public int getluminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        luminosita = luminosita;
    }

    public Immagine(String Titolo, int Luminosita) {
        super(Titolo);
        this.luminosita = Luminosita;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));

    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }


    }

    @Override
    public void esegui() {

    }
}


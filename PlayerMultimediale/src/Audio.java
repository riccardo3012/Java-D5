import javax.swing.border.TitledBorder;

public class Audio extends ElementoMultimediale{
public int volume;
public int durata;

    public Audio(String Titolo, int luminosita, int durata) {
        super(Titolo);
        this.volume = luminosita;
        this.durata = durata;
    }

    public int getLuminosita() {
        return volume;
    }

    public void setLuminosita(int luminosita) {
        this.volume = luminosita;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void play(){
        for (int i =0;i<durata;i++);

        for (int i =0;i<volume;i++);
        System.out.printf(titolo + " " +durata+volume);
    }

public void abbassaVolume() {
    if (volume > 0) {
        volume--;
    }
}
    public void alzaVolume(){
     volume++;
    }


    @Override
    public void esegui() {

    }
}


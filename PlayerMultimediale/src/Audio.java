import javax.swing.border.TitledBorder;

public class Audio extends ElementoMultimediale{
public int volume;
public int durata;

    public Audio(String Titolo, int luminosita, int durata) {
        super(Titolo);
        this.volume = luminosita;
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int luminosita) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void play(){

        System.out.printf(titolo + " " +durata+" "+volume);
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


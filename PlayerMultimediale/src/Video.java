public class Video extends ElementoMultimediale {
    public int durata;
    public int volume;
    public int luminosita;
    public Video(String titolo, int luminosita, int durata, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;

    } public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
    public int getDurata() {
        return durata;

    }
    public void aumentaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
    public void play(){
        System.out.printf(titolo + " " +durata+" "+volume +" "+luminosita);
    }
    @Override
    public void esegui(){
        play();

    }


}

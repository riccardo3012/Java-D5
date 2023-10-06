public class Video extends ElementoMultimediale {
    public int durata;
    public int volume;
    public int luminosita;
    public Video(String titolo, int luminosita, int durata, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;

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
        for(int i = 0; i<durata; i++){

        for (int j = 0;j<volume;j++){
            System.out.printf(titolo + " " + "!".repeat(j+1) );
        }
            for (int k = 0;k<luminosita;k++){
                System.out.printf(titolo + " " + "*".repeat(k+1) );
            }
        }
    }
    @Override
    public void esegui(){
        play();

    }
}

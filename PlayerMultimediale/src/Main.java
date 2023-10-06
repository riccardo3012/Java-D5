import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] playlist = new ElementoMultimediale[3];

        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Inserisci il titolo dell'elemento multimediale #" + (i + 1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Seleziona il tipo di elemento multimediale (1=Audio, 2=Video, 3=Immagine):");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci la durata dell'audio:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume dell'audio:");
                    int volumeAudio = scanner.nextInt();
                    playlist[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case 2:
                    System.out.println("Inserisci la durata del video:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume del video:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del video:");
                    int luminositaVideo = scanner.nextInt();
                    playlist[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosità dell'immagine:");
                    int luminositaImmagine = scanner.nextInt();
                    playlist[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    i--;
                    break;
            }
            scanner.nextLine(); // Consuma il newline
            System.out.println("Lista degli elementi multimediali:");
            for (int j = 0; j <= i; j++) {
                ElementoMultimediale elemento = playlist[j];
                int durataElemento = 1;

                String infoElemento = elemento.titolo;

                if (elemento instanceof Audio) {
                    int volume = ((Audio) elemento).getVolume();
                    durataElemento = ((Audio)elemento).getDurata();
                    infoElemento += " " + "durata:" + elemento.titolo.repeat(durataElemento-1) + " - Volume: " +( "!".repeat(volume+1));
                } else if (elemento instanceof Video) {
                    int volume = ((Video) elemento).getVolume();
                    int luminosita = ((Video) elemento).getLuminosita();
                    durataElemento = ((Video)elemento).getDurata();
                    infoElemento += " " + "durata:" + elemento.titolo.repeat(durataElemento)+ " - Volume: " + "!".repeat(volume) + " - Luminosità: " + "*".repeat(luminosita);
                }else if (elemento instanceof Immagine){
                    int luminosita = ((Immagine) elemento).getluminosita();
                    infoElemento+= " " + "luminosita: "+"*".repeat(luminosita);
                }

                System.out.println((j + 1) + ". " + infoElemento);
            }

        }


        scanner.close();
    }
}

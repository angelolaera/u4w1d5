import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao utente, imposta il volume della tua traccia:");
        int volume = Integer.parseInt(scanner.nextLine());

        RegistrazioneAudio registrazioneAudio = new RegistrazioneAudio("Audio Whatsapp", volume, 15);
        registrazioneAudio.play();

        System.out.println("Vuole gestire il livello del volume? Prego rispondere con alza/abbassa");
        String risposta = scanner.nextLine();

        switch (risposta) {
            case "alza":
                registrazioneAudio.alzaVolume();
                registrazioneAudio.play();
                break;
            case "abbassa":
                registrazioneAudio.abbassaVolume();
                registrazioneAudio.play();
                break;
        }


        Scanner scannerVideo = new Scanner(System.in);
        System.out.println("Ciao utente, imposta il volume del tuo video:");
        int volumeVideo = Integer.parseInt(scannerVideo.nextLine());

        System.out.println("Ciao utente, imposta la luminosità del tuo video:");
        int luminositaVideo = Integer.parseInt(scannerVideo.nextLine());

        Video video = new Video ("Video bello",volumeVideo,luminositaVideo,15);
        video.play();


        System.out.println("Vuole gestire il livello del volume del video? Prego rispondere con alza/abbassa");
        String rispostaVideo = scanner.nextLine();

        switch (rispostaVideo) {
            case "alza":
                video.alzaVolume();
                video.play();
                break;
            case "abbassa":
                video.abbassaVolume();
                video.play();
                break;
        }

        System.out.println("Vuole gestire il livello della luminosità? Prego rispondere con alza/abbassa");
        String rispostaVideoLum = scanner.nextLine();

        switch (rispostaVideoLum) {
            case "alza":
                video.alzaLuminosita();
                video.play();
                break;
            case "abbassa":
                video.abbassaLuminosita();
                video.play();
                break;
        }

        System.out.println("Inserire il livello di luminosità per l'immagine: ");
        int lumImmagine = Integer.parseInt(scanner.nextLine());

        Immagine immagine = new Immagine("Immagine bella",lumImmagine);
        immagine.show();


    }
}
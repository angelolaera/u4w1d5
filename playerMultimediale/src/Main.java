import entities.RegistrazioneAudio;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ciao utente, imposta il volume della tua traccia:");
        int volume = Integer.parseInt(scanner.nextLine());

        RegistrazioneAudio registrazioneAudio = new RegistrazioneAudio("Audio Whatsapp",volume,15);
        registrazioneAudio.play();

        System.out.println("Vuole gestire il livello del volume? Prego rispondere con alza/abbassa");
        String risposta  = scanner.nextLine();

        switch (risposta){
            case "alza":
                registrazioneAudio.alzaVolume();
                registrazioneAudio.play();
            break;
            case "abbassa":
                registrazioneAudio.abbassaVolume();
                registrazioneAudio.play();
            break;
        }


    }
}
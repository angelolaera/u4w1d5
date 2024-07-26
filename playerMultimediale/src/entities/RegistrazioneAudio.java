package entities;


import interfaces.Play;

import java.util.Scanner;

public class RegistrazioneAudio extends ElementoMultimediale implements Play {
    // 1- Attributi
    private int volume;
    private int durata;

    // 2- Costruttori


    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    Scanner scanner =new Scanner(System.in);
    // 3- Metodi
    public void alzaVolume(){
        System.out.println("Inserire nuovo valore volume");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if(valoreVolume > 0 && valoreVolume > this.volume){
            setVolume(valoreVolume);
        }else{
            System.out.println("Impossibile alzare il volume, prego inserire valore corretto:");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }
    }

    public void abbassaVolume(){
        System.out.println("Inserire nuovo valore volume");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if(valoreVolume > 0 && valoreVolume<this.volume){
            setVolume(valoreVolume);
        }else{
            System.out.println("Impossibile abbasare il volume, prego inserire valore corretto:");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }


    @Override
    public void play() {
        for (int i=0; i<durata ;i++){
            System.out.println(getTitolo()+ " " + "!".repeat(volume));
        }
    }
}




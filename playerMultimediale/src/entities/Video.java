package entities;

import interfaces.Luminosita;
import interfaces.Play;

import java.util.Scanner;

public class Video extends ElementoMultimediale implements Luminosita, Play {

    private int volume;
    private int luminosita;
    private int durata;

    public Video(String titolo, int volume, int luminosita, int durata) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata = durata;
    }

    Scanner scanner = new Scanner(System.in);

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

    public void alzaLuminosita(){
        System.out.println("Inserire nuovo valore luminosita");
        int valoreLuminosita = Integer.parseInt(scanner.nextLine());
        if(valoreLuminosita > 0 && valoreLuminosita > this.luminosita){
            setLuminosita(valoreLuminosita);
        }else{
            System.out.println("Impossibile alzare il volume, prego inserire valore corretto:");
            valoreLuminosita = Integer.parseInt(scanner.nextLine());
        }
    }

    public void abbassaLuminosita(){
        System.out.println("Inserire nuovo valore luminosita");
        int valoreluminosita = Integer.parseInt(scanner.nextLine());
        if(valoreluminosita > 0 && valoreluminosita <this.luminosita){
            setLuminosita(valoreluminosita);
        }else{
            System.out.println("Impossibile abbasare il volume, prego inserire valore corretto:");
            valoreluminosita = Integer.parseInt(scanner.nextLine());
        }
    }


    @Override
    public void luminosita() {
        for (int i=0; i<durata ;i++){
            System.out.println(getTitolo()+ " " + "*".repeat(luminosita));
        }
    }

    @Override
    public void play() {
        for (int i=0; i<durata ;i++){
            System.out.println(getTitolo()+ " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
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

    public void setDurata(int durata) {
        this.durata = durata;
    }
}

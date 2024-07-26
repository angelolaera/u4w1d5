package entities;

import interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }


    @Override
    public void show() {
        System.out.println(getTitolo()+ " " + "*".repeat(luminosita));
    }
}

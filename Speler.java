package fill;

import java.util.Random;
import java.util.Scanner;

public class Speler {
    private String naam;
    private int leeftijd;
    private String gebruikersNaam;
    Random random = new Random();
    private Zet.Color color;

    public Speler(String naam, int leeftijd, String gebruikersNaam) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gebruikersNaam = gebruikersNaam;
    }
    public Speler(Zet.Color color) {
        this.color = color;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public void setGebruikersNaam(String gebruikersNaam) {
        this.gebruikersNaam = gebruikersNaam;
    }

    @Override
    public String toString() {
        return "fill.Speler{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", gebruikersNaam='" + gebruikersNaam + '\'' +
                '}';
    }
    public void play(Speelbord bord) {
        Scanner keyboard = new Scanner(System.in);
        boolean plaats = false;
        int kolom;
        int rij;

        while (!plaats) {
            System.out.println("welke rij?(0,1,2)");
            kolom = keyboard.nextInt();
            System.out.println("welke kolom?(0,1,2)");
            rij = keyboard.nextInt();
            //plaats = bord.maakZet(new Zet(color), kolom, rij);
            plaats = bord.maakZetJuiste((new Zet(color)), new Move(kolom, rij));
        }
    }
}

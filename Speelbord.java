package fill;

import java.util.Scanner;

public class Speelbord {
    private boolean contact;

    public static final int BREEDTE = 3;
    public static final int HOOGTE = 3;
    private Zet[][] zetten;
    private int teller;

    public Speelbord() {
        this.zetten = new Zet[BREEDTE][HOOGTE];
    }

    public String toString() { //deze methode maakt het patroon aan
        StringBuilder printBord = new StringBuilder(" 0 1 2 ");
        printBord.append("\n").append("-".repeat(BREEDTE * 2 + 1)).append("\n");
        for (int i = 0; i < HOOGTE; i++) {
            printBord.append("|");
            for (int j = 0; j < BREEDTE; j++) {
                if (zetten[i][j] != null) {
                    printBord.append(zetten[i][j].getColor().toString()).append("|");
                } else {
                    printBord.append(" ").append("|");
                }
            }
            printBord.append("\n").append("-".repeat(BREEDTE * 2 + 1)).append("\n");
        }
        return printBord.toString();
    }

    public boolean maakZet(Zet zet, int kolom, int rij) { //zorgt dat de x op een bepaalde plaats komt
        int[] laatsteRij = new int[10];
        int[] laatsetKolom = new int[10];
        for (int i = 0; i < 9; i++) {
            if (this.zetten[rij][kolom] == null) {

                if (laatsetKolom[i] == 0 && laatsteRij[i] == 0) {
                    if (laatsetKolom[i] + 1 < kolom || laatsteRij[i] + 1 < rij){
                        System.out.println("verkeerde zet");
                        break;
                    }
                    else{
                        this.zetten[rij][kolom] = zet;
                        this.teller++;
                        laatsetKolom[i] = kolom;
                        laatsteRij[i] = rij;
                        return true;
                    }
                } else if (laatsetKolom[i] + 1 > kolom && laatsteRij[i] + 1 > rij) {
                    System.out.println("verkeerde zet");
                }

            }
        }
        return false;
    }

    boolean isVol() {
        return this.teller == BREEDTE * (HOOGTE);
    }
}

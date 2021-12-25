package fill;

import java.util.*;


public class Speelbord {
    private boolean contact;

    public static final int BREEDTE = 3;
    public static final int HOOGTE = 3;
    private Zet[][] zetten;
    private Move laatsteZet;
    private List<Move> laatsteZetten = new ArrayList<>();
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

    private boolean isAllowedMove(Move move){
        if(this.laatsteZet == null) return true; // nog geen moves gemaakt dus altijd allowed.

        boolean reedsGespeeld = !List.of(this.laatsteZetten).contains(move);// gebruikt de equals method van Move
        boolean naastLaatsteZet = move.isNaast(this.laatsteZet);
        return reedsGespeeld && naastLaatsteZet;
    }

    public boolean maakZetJuiste(Zet zet, Move move){//maakZetJuiste genoemd omdat dit de goede is
        if(this.isAllowedMove(move)){
            this.zetten[move.rij][move.kolom] = zet;
            this.teller++;
            this.laatsteZet = move;
            this.laatsteZetten.add(move);
            return true;
        }
        if(!(this.isAllowedMove(move))) System.out.println("Dit is een verkeerde zet");

        return false;
    }

    public boolean maakZet(Zet zet, int kolom, int rij) { //zorgt dat de x op een bepaalde plaats komt (oude versie)
        int[] laatsteRij = new int[10];
        int[] laatsetKolom = new int[10];
        for (int i = 0; i < 10; i++) {
            if (this.zetten[rij][kolom] == null) {

                if (laatsetKolom[i] == 0 && laatsteRij[i] == 0) {
                    if (laatsetKolom[i] + 1 < kolom || laatsteRij[i] + 1 < rij){
                        System.out.println("verkeerde zet");
                        break;
                    } else {
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
    }// deze versie mag ook weg (wordt niet gebruikt)

    boolean isVol() {
        return this.teller == BREEDTE * (HOOGTE);
    }
}

package fill;

import java.util.Scanner;

public class TestMain {


    public static void main(String[] args) {
        int BREEDTE = 2;
        final int HOOGTE = 3;
        char[][] zetten = new char[BREEDTE][HOOGTE];
        int teller;
        int rij;
        int kolom;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef rij");
        rij = keyboard.nextInt();
        System.out.println("geef kolom");
        kolom = keyboard.nextInt();



        zetten[rij][kolom] = 'X';





        for (char[] zettenkes : zetten) {
            for (char zetje : zettenkes) {
                System.out.print(zetje + " ");

            }
            System.out.println();
        }


    }
}


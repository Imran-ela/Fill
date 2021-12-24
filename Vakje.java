package fill;

public class Vakje {
    private boolean onderdeelPatroon;
    private final int BREEDTE =10;
    private final int HOOGTE=10;
    char [][] vakje;
    public Vakje() {
        this.vakje = vakje;
    }
    public void kleurGrijsIn() {
        vakje[1][1] = 'X';
    }
    /*static char[][] maakVakje() {
        char[][] karakter = new char[10][10];
        for(int i = 0; i < karakter.length; i++)
        {
            karakter[i][0] = '/';
            karakter[i][karakter.length-1] = '/';
            for(int j = 0; j < karakter.length; j++)
            {
                karakter[0][j] = '-';
                karakter[karakter.length-1][j] = '-';
                System.out.printf("%2c ", karakter[i][j]);
            }
            System.out.println();

        }
        return karakter;
    }*/
    public void kleurWitIn() {
        for(int i =0;i< vakje.length; i++) {
            for (int j = 0; j< vakje.length; j++){
                vakje[1][1] = 'O';
            }
        }
    }
}

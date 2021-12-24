package fill;

public class Patroon {
    private int aantalVakjes;
    private Speelbord speelbord = new Speelbord();

    public Patroon(int aantalVakjes) {
        this.aantalVakjes = aantalVakjes;
    }
    /*public void tekenPatroon() {
        speelbord.maakSpeelbord();

    }*/


    public boolean isOpgelost() {
        return false;

    }

    public void kleurGrijsIn() {
        //vakje[1][1] = 'X';
    }

}

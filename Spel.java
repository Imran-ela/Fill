package fill;



public class Spel {
    private Speler speler;

    private Speelbord bord;

    public Spel() {
        bord = new Speelbord();
        speler = new Speler(Zet.color.RED);
    }

    public void startSpel() {
        System.out.println(bord.toString());
        do {
            speler.play(bord);

            System.out.println(bord.toString());

        }while (!bord.isVol());
        if (bord.isVol()) {
            System.out.println("You won");
        }

    }
    public void selecteerLevel() {

    }
    public void herstartSpel() {

    }

    @Override
    public String toString() {
        return "Spel{" +
                "speler=" + speler +

                '}';
    }
}

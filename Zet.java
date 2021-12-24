package fill;

public class Zet {//naam van zet moet nog veranderd worden naar iets toepasselijker
    public static Color color;
    //private Move vorigeMove;
    private Move move;

    public Zet(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    public enum Color{
        RED("x");

        private String waarde;

        Color(String waarde) {
            this.waarde = waarde;
        }

        @Override
        public String toString() {
            return waarde;
        }
    }
}

package fill;

public class Level {
    private boolean beschikbaar;
    private int graadLevel;
    private Opgave opgave;

    public Level(boolean beschikbaar, int graadLevel, Opgave opgave) {
        this.beschikbaar = beschikbaar;
        this.graadLevel = graadLevel;
        this.opgave = opgave;
    }

    @Override
    public String toString() {
        return "Level{" +
                "beschikbaar=" + beschikbaar +
                ", graadLevel=" + graadLevel +
                ", opgave=" + opgave +
                '}';
    }
    public void kiesLevel() {

    }
    public boolean openLevel() {
        return false;
    }
    public void verlaatLevel() {
        
    }
}

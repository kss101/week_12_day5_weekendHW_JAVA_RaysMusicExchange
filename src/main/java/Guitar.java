public class Guitar extends Instrument {

    private int numOfFrets;

    public Guitar(String description, double boughtPrice, double sellPrice, String madeFrom, String category, String colour, int numOfFrets) {
        super(description, boughtPrice, sellPrice, madeFrom, category, colour);
        this.numOfFrets = numOfFrets;
    }

    public int getNumOfFrets() {
        return numOfFrets;
    }

    public void setNumOfFrets(int numOfFrets) {
        this.numOfFrets = numOfFrets;
    }

    public String play() {
        return "Strum strum";
    }

    public double calculateMarkup() {
        return 0;
    }
}

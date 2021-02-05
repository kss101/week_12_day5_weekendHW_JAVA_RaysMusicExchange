public class Guitar extends Instrument {

    private int numOfFrets;

    public Guitar(String madeFrom, String category, String colour, int numOfFrets) {
        super(madeFrom, category, colour);
        this.numOfFrets = numOfFrets;
    }

    public Guitar(String madeFrom, String category, String colour) {
        super(madeFrom, category, colour);
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
}

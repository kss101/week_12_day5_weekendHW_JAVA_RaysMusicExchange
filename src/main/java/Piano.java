public class Piano extends Instrument{

    private PianoType type;

    public Piano(String description, double boughtPrice, double sellPrice, String madeFrom, String category, String colour, PianoType type) {
        super(description, boughtPrice, sellPrice, madeFrom, category, colour);
        this.type = type;
    }

    public int getNumOfKeys() {
        return type.getValue();
    }

    public PianoType getPianoType() {
        return type;
    }

    public String play() {
        return "Plink plonk";
    }
}

public class Violin extends Instrument {

    private ViolinType type;

    public Violin(String description, double boughtPrice, double sellPrice, String madeFrom, String category, String colour, ViolinType type) {
        super(description, boughtPrice, sellPrice, madeFrom, category, colour);
        this.type = type;
    }

    public ViolinType getViolinType() {
        return type;
    }

    public String play() {
        return "Skreeeeeeee...";
    }
}

public abstract class Instrument extends ItemForSale implements IPlay, ISell {
    private String madeFrom;
    private String category;
    private String colour;

    public Instrument(String description, double boughtPrice, double sellPrice, String madeFrom, String category, String colour) {
        super(description, boughtPrice, sellPrice);
        this.madeFrom = madeFrom;
        this.category = category;
        this.colour = colour;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

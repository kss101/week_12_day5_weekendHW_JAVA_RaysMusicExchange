public class ItemForSale implements ISell{
    private String description;
    private double boughtPrice;
    private double sellPrice;

    public ItemForSale(String description, double boughtPrice, double sellPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        double markUp = (( sellPrice - boughtPrice ) / boughtPrice) * 100;
        return Math.round(markUp * 100.0 )/100.0;
    }
}

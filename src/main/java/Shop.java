import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }

    public ArrayList<ISell> getStock(){
        return stock;
    }

    public void setStock(ArrayList<ISell> stock){
        this.stock = stock;
    }

//    public double getTotalPotentialProfit(ArrayList<ISell> stock){
//        double totalProfit = 0.00;
//        for(ISell stockItem : stock ){
//            double percentageMarkup = stockItem.calculateMarkup();
//            ((ItemForSale)stockItem).
//
//        }
//    }
}

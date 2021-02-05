import org.junit.Before;
import org.junit.Test;
import sun.nio.cs.ext.ISCII91;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop raysMusicExchange;

    @Before
    public void before(){
        raysMusicExchange = new Shop();
    }

    @Test
    public void canCreateShop(){
        assertNotNull(raysMusicExchange);
    }

    @Test
    public void canCheckInitialStockIsEmpty(){
        assertEquals(0, raysMusicExchange.getStock().size());
    }

    @Test
    public void canAddItemToStock(){
        ItemForSale musicSheet = new ItemForSale("Pad of 25 pages of blank sheet music paper", 2.50, 10);
        raysMusicExchange.addItemToStock(musicSheet);
        assertEquals(1, raysMusicExchange.getStock().size());
    }

    @Test
    public void canGetDetailsOfStockItem(){
        ItemForSale musicSheet = new ItemForSale("Pad of 25 pages of blank sheet music paper", 2.50, 10);
        raysMusicExchange.addItemToStock(musicSheet);
        ItemForSale item = (ItemForSale) raysMusicExchange.getStock().get(0);
        assertEquals("Pad of 25 pages of blank sheet music paper", item.getDescription());
    }

    @Test
    public void canRemoveItemFromStock(){
        ArrayList<ISell> newStock = new ArrayList<ISell>();
        raysMusicExchange.setStock(newStock);
        ItemForSale musicSheet = new ItemForSale("Pad of 25 pages of blank sheet music paper", 2.50, 10);
        raysMusicExchange.addItemToStock(musicSheet);
        raysMusicExchange.removeItemFromStock(musicSheet);
        assertEquals(0, raysMusicExchange.getStock().size());
    }

    @Test
    public void canAddInstrumentToStock(){
       Violin violin = new Violin("Entry level violin suitable for a beginner", 60, 135.99, "Wood", "String", "Brown", ViolinType.BEGINNER);
       raysMusicExchange.addItemToStock(violin);
       assertEquals(1, raysMusicExchange.getStock().size());
    }

    @Test
    public void canRemoveInstrumentFromStock(){
        Guitar guitar = new Guitar( "Basic beginners guitar", 45.00, 88.50,"Wood", "String", "White", 12);
        ArrayList<ISell> newStock = new ArrayList<ISell>();
        raysMusicExchange.setStock(newStock);
        raysMusicExchange.addItemToStock(guitar);
        raysMusicExchange.removeItemFromStock(guitar);
        assertEquals(0, raysMusicExchange.getStock().size());
    }
}

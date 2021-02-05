import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ItemForSaleTest {

    @Test
    public void canCreateItemForSale() {
        ItemForSale musicSheet = new ItemForSale("Pad of 25 pages of blank sheet music paper", 2.50, 5.99);
        assertNotNull(musicSheet);
    }

    @Test
    public void canGetMarkUp() {
        ItemForSale musicSheet = new ItemForSale("Pad of 25 pages of blank sheet music paper", 2.50, 10);
        assertEquals(400, musicSheet.calculateMarkup(), 0);
    }

    @Test
    public void canCreatePianoForSale() {
        Piano piano = new Piano("Upright piano", 299.00, 400.00, "Wood", "Keyboard", "Black", PianoType.BEGINNER);
        ItemForSale pianoForSale = piano;
        assertNotNull(pianoForSale);
    }

    @Test
    public void canGetPianoMarkUp(){
        Piano piano = new Piano("Upright piano", 250.00, 375.00, "Wood", "Keyboard", "Black", PianoType.BEGINNER);
        ItemForSale pianoForSale = piano;
        assertEquals(150.00, pianoForSale.calculateMarkup(), 0.0);
    }



}

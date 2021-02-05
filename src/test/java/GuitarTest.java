import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar( "Basic beginners guitar", 45.00, 88.50,"Wood", "String", "White", 12);
    }

    @Test
    public void canCreateGuitar(){
        assertNotNull(this.guitar);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", this.guitar.getMadeFrom());
    }

    @Test
    public void canGetCategory(){
        assertEquals("String", this.guitar.getCategory());
    }

    @Test
    public void canGetColour(){
        assertEquals("White", this.guitar.getColour());
    }

    @Test
    public void canGetSound(){
        assertEquals("Strum strum", this.guitar.play());
    }


}

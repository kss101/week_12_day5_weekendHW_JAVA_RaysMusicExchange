import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano( "Upright piano",299.00,400.00,"Wood", "Keyboard", "Black", PianoType.BEGINNER);
    }

    @Test
    public void canCreatePiano(){
        assertNotNull(this.piano);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", this.piano.getMadeFrom());
    }

    @Test
    public void canGetCategory(){
        assertEquals("Keyboard", this.piano.getCategory());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", this.piano.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(PianoType.BEGINNER, this.piano.getPianoType());
    }

    @Test
    public void canGetNumOfKeys(){
        assertEquals(66, this.piano.getPianoType().getValue());
    }

    @Test
    public void canGetSound(){
        assertEquals("Plink plonk", this.piano.play());
    }


}

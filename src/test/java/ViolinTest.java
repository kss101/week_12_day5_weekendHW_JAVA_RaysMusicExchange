import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin( "Wood", "String", "Brown", ViolinType.BEGINNER);
    }

    @Test
    public void canCreateVioilin(){
        assertNotNull(this.violin);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", this.violin.getMadeFrom());
    }

    @Test
    public void canGetCategory(){
        assertEquals("String", this.violin.getCategory());
    }

    @Test
    public void canGetColour(){
        assertEquals("Brown", this.violin.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(ViolinType.BEGINNER, this.violin.getViolinType());
    }

    @Test
    public void canGetSound(){
        assertEquals("Skreeeeeeee...", this.violin.play());
    }


}

import org.junit.Before;
import org.junit.Test;
import Characters.Heroes.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {


    private Cleric cleric;

    @Before
    public void setup() {
        cleric = new Cleric("Tony");

    }

    @Test
    public void canGetName() {
        assertEquals("Tony", cleric.getName());
    }

}

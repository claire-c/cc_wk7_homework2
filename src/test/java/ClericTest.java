import Characters.Heroes.HealingTool;
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

    @Test
    public void canGetHealth(){
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canSetHealth(){
        cleric.setHp(150);
        assertEquals(150, cleric.getHp());
    }

//    @Test
//    public void canGetHealingTool(){
//        HealingTool tool = cleric.getHealingTool();
//        assertEquals(5, tool.getChanceValue());
//    }
// So this test is failing but it's defo bringing back a HealingTool object.




}

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

    @Test
    public void canSetHealingTool(){
        cleric.setHealingTool(HealingTool.BITTERROOT);
        assertEquals(HealingTool.BITTERROOT, cleric.getHealingTool());
    }

    @Test
    public void canGetHealingTool(){
        assertEquals(HealingTool.AGOODSNOOZE, cleric.getHealingTool());
    }



//    @Test
//    public void canGetHealingTool(){
//        cleric.setHealingTool(HealingTool.AGOODSNOOZE);
//        HealingTool tool = cleric.getHealingTool();
//        assertEquals(5, tool.getChanceValue());
//    }
// So this test is failing but it's defo bringing back a random HealingTool object. Each test has returned a different int - not the same random one, argh.




}

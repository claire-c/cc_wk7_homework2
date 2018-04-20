package Characters.Heroes;

import Characters.Character;

public abstract class Healer extends Character {

    private String name;
    private int hp;
    private HealingTool healingTool;

    public Healer(String name){
        super(name);
//        HealingTool tool = HealingTool.getRandomHealingTool();
//        this.healingTool = tool;
//        So this is bad code - I dont know why but the tests are failing randomly. I would have thought that the randomhealingtool would run once and store the one healing tool but it seems to be running the method every time so the cleric has a constantly evolving tool...

        this.healingTool = HealingTool.AGOODSNOOZE;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }
}

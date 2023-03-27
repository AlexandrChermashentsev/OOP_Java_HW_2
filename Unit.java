package Seminar_2.Home_Work.v2;

public class Unit extends Object_Parent implements HasHealthPoint, Tiredness {
    protected int currentTirednes;
    protected int maxTiredness;
    
    public Unit(int currentHealthPoint, int currentTirednes, String name){
        this.currentHealthPoint = currentHealthPoint;
        this.maxHealthPoint = 100;
        this.currentTirednes = currentTirednes;
        this.maxTiredness = 100;
        this.name = name;
    }


    @Override
    public int getCurrentHealthPoint() {
        return super.getCurrentHealthPoint();
    }

    @Override
    public int getMaxHealthPoint() {
        return super.getMaxHealthPoint();
    }

    @Override
    public int getCurrentEnergy() {
        return currentTirednes;
    }

    @Override
    public int getMaxEnergy() {
        return maxTiredness;
    }

}

package Seminar_2.Home_Work.v2;

public class Ghost extends Object_Parent implements Tiredness{
    private int currentTirednes;
    private int maxTiredness;

    public Ghost(int currentTirednes, String name){
        this.currentTirednes = currentTirednes;
        this.name = name;
        this.maxTiredness = 100;
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

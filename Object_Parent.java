package Seminar_2.Home_Work.v2;

public abstract class Object_Parent {

    protected int maxHealthPoint;
    protected int currentHealthPoint;
    String name;

    public String getName(){
        return name;
    }
    public int getMaxHealthPoint(){
        return maxHealthPoint;
    }
    public int getCurrentHealthPoint(){
        return currentHealthPoint;
    }
}

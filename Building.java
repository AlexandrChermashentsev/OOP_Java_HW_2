package Seminar_2.Home_Work.v2;

public class Building extends Object_Parent implements HasHealthPoint{  


    public Building(int currantHealthPoint, String name){
        this.maxHealthPoint = 100;
        this.currentHealthPoint = currantHealthPoint;
        this.name = name;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

}

package Seminar_2.Home_Work.v2;

public class Render {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";
    
    //System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
    // BLACK(0, 24), RED(25, 50), GREEN(51-100)

    public void render(Object object) {

// Если у объекта и хп и энергия
        if (object instanceof HasHealthPoint && object instanceof Tiredness) {

            renderHasHealthPoint(object);
            renderHasEnergy(object);

// если у объекта только энергия (не знаю могут ли быть такие объекты?! Пусть будет Призрак )
        } else if (object instanceof Tiredness) {

            System.out.println(((Object_Parent) object).getName());
            renderHasEnergy(object);
// если у объекта только хп
        } else {
            
            renderHasHealthPoint(object);
        }
    }
    

    public void renderHasEnergy(Object object){
        if (((Tiredness) object).getCurrentEnergy() <= 24){
            // System.out.println(((Object_Parent) object).getName());
            System.out.println("Energy: " + ANSI_BLACK + ((Tiredness) object).getCurrentEnergy() + ANSI_RESET
            + " from " + ((Tiredness) object).getMaxEnergy());
        
        } else if (((Tiredness) object).getCurrentEnergy() >= 24 &&
        ((Tiredness) object).getCurrentEnergy() <= 50){
            // System.out.println(((Object_Parent) object).getName());
            System.out.println("Energy: " + ANSI_RED + ((Tiredness) object).getCurrentEnergy() + ANSI_RESET
            + " from " + ((Tiredness) object).getMaxEnergy());
            
        } else {
            // System.out.println(((Object_Parent) object).getName());
            System.out.println("Energy: " + ANSI_GREEN + ((Tiredness) object).getCurrentEnergy() + ANSI_RESET
            + " from " + ((Tiredness) object).getMaxEnergy());
        }
    }

    public void renderHasHealthPoint(Object object){
        if (((HasHealthPoint) object).getCurrentHealthPoint() <= 24){
            System.out.println(((Object_Parent) object).getName());
            System.out.println("HP: " + ANSI_BLACK + ((HasHealthPoint) object).getCurrentHealthPoint() + ANSI_RESET
            + " from " + ((HasHealthPoint) object).getMaxHealthPoint());
        } else if (((HasHealthPoint) object).getCurrentHealthPoint() >= 24 &&
        ((HasHealthPoint) object).getCurrentHealthPoint() <= 50){
            System.out.println(((Object_Parent) object).getName());
            System.out.println("HP: " + ANSI_RED + ((HasHealthPoint) object).getCurrentHealthPoint() + ANSI_RESET
            + " from " + ((HasHealthPoint) object).getMaxHealthPoint());
        } else {
            System.out.println(((Object_Parent) object).getName());
            System.out.println("HP: " + ANSI_GREEN + ((HasHealthPoint) object).getCurrentHealthPoint() + ANSI_RESET
            + " from " + ((HasHealthPoint) object).getMaxHealthPoint());
        }
    }
}

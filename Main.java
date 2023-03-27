package Seminar_2.Home_Work.v2;

import java.util.ArrayList;
import java.util.Random;

/*
Представьте, что вы пишете класс Render,
который отвечает за вывод на экран текущего уровня жизней и усталости какого-то объекта.
(Подразумеваем, что вывод на экран - это просто печать в консоль)
У класса есть 1 метод, который принимает тип Object и делает следующее:
1. Если object типа HasHealthPoint, то выводим его уровень жизни
2. Если object типа Tiredness, то выводим его уровень усталости
При этом текст значения должен иметь цвет в соответствии с правилом:
BLACK(0, 24), RED(25, 50), GREEN(51-100)
3. Создать несколько классов:
3.1 Здание. Имеет только жизни.
3.2 Персонаж. Имеет и жизни, и усталость
*/

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();


        ArrayList <Object> obj = new ArrayList<>();
        obj.add(new Building(rnd.nextInt(100), "Ратуша"));
        obj.add(new Building(rnd.nextInt(100), "Ферма"));
        obj.add(new Building(rnd.nextInt(100), "Казармы"));
        obj.add(new Unit(rnd.nextInt(100), rnd.nextInt(100), "Пехотинец"));
        obj.add(new Unit(rnd.nextInt(100), rnd.nextInt(100), "Грифон"));
        obj.add(new Unit(rnd.nextInt(100), rnd.nextInt(100), "Рыцарь"));
        obj.add(new Ghost(rnd.nextInt(100), "Ghost"));


        Render render = new Render();

        for (int i = 0; i < obj.size(); i++) {
            render.render(obj.get(i));
            System.out.println();
        }

    }
}

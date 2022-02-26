package JCHomwork3Task2;

import java.util.ArrayList;

public class RunClass {
    public static void main(String[] args) {

        ArrayList<Apple> applesList = new ArrayList<>(7);
        Apple apple0 = new Apple(1.0f);
        Apple apple1 = new Apple(1.0f);
        Apple apple2 = new Apple(1.0f);
        Apple apple3 = new Apple(1.0f);
        Apple apple4 = new Apple(1.0f);
        Apple apple5 = new Apple(1.0f);

        

        Box<Apple> box1 = new Box<>(applesList);
        Box<Apple> box2 = new Box<>(applesList);
        box1.compareList(box2);


        ArrayList<Orange> orangeArrayList = new ArrayList<>(7);
        Orange orange0 = new Orange(1.5f);
        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);
        Orange orange3 = new Orange(1.5f);
        Orange orange4 = new Orange(1.5f);
        Orange orange5 = new Orange(1.5f);
        Orange orange6 = new Orange(1.5f);

        Box<Orange> box3 = new Box<>(orangeArrayList);
        Box<Orange> box4 = new Box<>(orangeArrayList);
        box3.compareList(box4);

        System.out.println(box1.getAppleList());
        System.out.println(box2.getAppleList());

        System.out.println(box1.compareList(box2));
        box1.toEmptyList(box2);

        System.out.println(box2);
    }
}

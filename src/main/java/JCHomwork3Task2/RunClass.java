package JCHomwork3Task2;

import java.util.ArrayList;

public class RunClass {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>();
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);

        Orange orange = new Orange();
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);

        System.out.println("AppleBox weight: " + appleBox.getWeight().toString());
        System.out.println("OrangeBox weight: " + orangeBox.getWeight().toString());
        System.out.println("Compare: " + orangeBox.compare(appleBox).toString());
        System.out.println();

        Box<Apple> secondAppleBox = new Box<>();
        secondAppleBox.add(apple);

        System.out.println("AppleBox weight before move: " + appleBox.getWeight().toString());
        System.out.println("SecondAppleBox weight before move: " + secondAppleBox.getWeight().toString());

        secondAppleBox.moveTo(appleBox);

        System.out.println("AppleBox weight after move: " + appleBox.getWeight().toString());
        System.out.println("SecondAppleBox weight after move: " + secondAppleBox.getWeight().toString());
        System.out.println();

        System.out.println("AppleBox weight: " + appleBox.getWeight().toString());
        System.out.println("OrangeBox weight: " + orangeBox.getWeight().toString());
        System.out.println("Compare: " + orangeBox.compare(appleBox).toString());

    }
}
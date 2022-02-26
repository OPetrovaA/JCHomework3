package JCHomwork3Task2;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList){
        this.fruitList = fruitList;
    }

    public Float getAppleList(){
       Float result = Float.valueOf(0);
       for(T t : getFruitList()){
           if(t!=null) {
               Float value = t.getWeight();
               result = result + value;
           }
       }
       return result;
    }

    public boolean compareList(Box<T> box){
        if(this.getAppleList().floatValue() == box.getAppleList().floatValue()) return true;
        return false;
    }

    public void toEmptyList(Box<T> box){
        System.out.println("в новой коробке до: " + this.getAppleList());
        System.out.println("В старой коробке до: " + box.getAppleList());
        for(T t: box.getFruitList()){
            this.getFruitList().add(t);
        }
        box.getFruitList().clear();
        System.out.println("в новой коробке после: " + this.getAppleList());
        System.out.println("В старой коробке после: " + box.getAppleList());
    }

    //public void getWeight()


    public ArrayList<T> getFruitList(){
        return fruitList;
    }

}

package JCHomwork3Task2;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruitList; // содержимое коробки

   // public Box(ArrayList<T> content){
     //   this.content = content;
    //}

    public Box(){
        this.fruitList = new ArrayList<T>();
    }

    public Float getWeight(){   //
        if (this.fruitList.isEmpty()){ //проверка на ровно нулю
            return 0.0f;
        }
        return this.fruitList.size() * this.fruitList.get(0).getWeight(); //перемножаем кол-во элементов в массиве на вес нулевого элемента
    }

    public Boolean compare(Box<?> secondBox){
        return Math.abs(this.getWeight() - secondBox.getWeight()) < 0.0001;
    }

    public void add(T fruit){
        this.fruitList.add(fruit);
    }

    // public void clear(){
      //  this.content.clear();
    //}

    public void moveTo(Box<T> secondBox){ // метод пересыпание фруктов
        for (T fruit : this.fruitList){
            secondBox.add(fruit); // вторая коробка
        }
        this.fruitList.clear();
    }
}
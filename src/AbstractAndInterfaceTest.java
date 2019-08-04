import Animal.Animal;
import Animal.Chicken;
import Animal.Tiger;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;


public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
//        int i;
        Animal[] animals = new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
//        for(i=0; i<animals.length; i++){
//            animals[i].makeSound();
//        }
        for(Animal animal:animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
//        if(animals[i] instanceof Chicken){
//            Edible edibler=(Chicken) animals[i];
//            System.out.println(edibler.howToEat());
//
//        }


        Fruit [] fruits= new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for(int i=0; i<fruits.length;i++){
            System.out.println(fruits[i].howToEat());
        }
    }
}

package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: Cluck! Cluck!!";
    }
    public String howToEat(){
        return "Chicken can be steamed";
    }
}

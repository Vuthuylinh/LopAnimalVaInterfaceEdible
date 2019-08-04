package fruit;

import edible.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat(){
        return "Apple can be slided";
    }
}

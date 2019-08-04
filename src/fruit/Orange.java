package fruit;

import edible.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public  String howToEat(){
        return "We can drink orange juice";
    }
}

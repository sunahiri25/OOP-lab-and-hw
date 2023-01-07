package factory.fruit;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            case "banana":
                return new Banana();
        }
        throw new RuntimeException("No matching object could be created");
    }
}

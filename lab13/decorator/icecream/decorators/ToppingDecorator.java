package decorator.icecream.decorators;

import decorator.icecream.icecreams.IceCream;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "\n" + addTopping();
    }

    public abstract String addTopping();
}

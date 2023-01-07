package decorator.icecream.decorators;

import decorator.icecream.icecreams.IceCream;

public class HoneyToppingDecorator extends ToppingDecorator {
    protected IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String addTopping() {
        return "Topping: Honey";
    }
}

package decorator.icecream.decorators;

import decorator.icecream.icecreams.IceCream;

public class NutsToppingDecorator extends ToppingDecorator {
    protected IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String addTopping() {
        return "Topping: Nuts";
    }
}

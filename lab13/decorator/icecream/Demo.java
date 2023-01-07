package decorator.icecream;

import decorator.icecream.decorators.HoneyToppingDecorator;
import decorator.icecream.decorators.NutsToppingDecorator;
import decorator.icecream.icecreams.ChocolateIceCream;
import decorator.icecream.icecreams.IceCream;
import decorator.icecream.icecreams.StrawberryIceCream;

public class Demo {
    public static void main(String[] args) {
        IceCream honeyIceCream = new HoneyToppingDecorator(new ChocolateIceCream());
        System.out.println(honeyIceCream.getDescription());

        IceCream nutsIceCream = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(nutsIceCream.getDescription());
    }
}

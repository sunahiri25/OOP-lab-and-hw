public class Dog1 extends Animal1 {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog1 another) {
        System.out.println("Woooooooooof!");
    }
}
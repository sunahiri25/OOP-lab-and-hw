public class BigDog1 extends Dog1 {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog1 another) {
        System.out.println("Woooooowwwww!");
    }
}
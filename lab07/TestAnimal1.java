public class TestAnimal1 {
    public static void main(String[] args) {
        // Using the subclasses
        Cat1 cat1 = new Cat1();
        cat1.greeting();
        Dog1 dog1 = new Dog1();
        dog1.greeting();
        BigDog1 bigDog1 = new BigDog1();
        bigDog1.greeting();

        // Using Polymorphism
        Animal1 animal1 = new Cat1();
        animal1.greeting();
        Animal1 animal2 = new Dog1();
        animal2.greeting();
        Animal1 animal3 = new BigDog1();
        animal3.greeting();
//        Animal1 animal4 = new Animal1(); // Animal1 is abstract; cannot be instantiated

        // Downcast
        Dog1 dog2 = (Dog1) animal2;
        BigDog1 bigDog2 = (BigDog1) animal3;
        Dog1 dog3 = (Dog1) animal3;
        Cat1 cat2 = (Cat1) animal2;
//        dog2.greeting(dog3); // class Dog1 cannot be cast to class Cat1
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
package brigde.example;

public class Client {
    public static void main(String[] args) {
        Computer computer = new PC(new WindowsOS());
        computer.startup();
        computer.browseInternet("fb.com");

        Computer computer1 = new Laptop(new MacOS());
        computer1.startup();
        computer1.browseInternet("youtube.com");
        if (computer1.canMoveComputer()) {
            System.out.println("Move to another place");
        }

    }
}

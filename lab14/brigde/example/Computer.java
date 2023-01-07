package brigde.example;

public abstract class Computer {
    protected OperatingSystem operatingSystem;

    public Computer(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void startup();

    public abstract void browseInternet(String url);

    public abstract boolean canMoveComputer();


}

package brigde.example;

public class Laptop extends Computer {
    public Laptop(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void startup() {
        operatingSystem.startup();
    }

    @Override
    public void browseInternet(String url) {
        operatingSystem.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }

}

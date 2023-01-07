package brigde.example;

public class PC extends Computer {
    public PC(OperatingSystem operatingSystem) {
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
        return false;
    }


}

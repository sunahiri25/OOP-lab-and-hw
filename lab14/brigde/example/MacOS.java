package brigde.example;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Mac start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Safari");
    }
}

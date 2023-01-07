package abtractfactory.crossplatformUI;

public class ApplicationConfigurator {
    static GUIFactory factory;

    public static void main(String[] args) throws Exception {
        String OSName = System.getProperty("os.name");
        if (OSName.contains("Windows")) {
            factory = new WinFactory();
        } else if (OSName.contains("Web")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}

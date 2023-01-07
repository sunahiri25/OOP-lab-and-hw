package factory.crossplatform;

public class Application {
    static Dialog dialog;

    public static void initialize() throws Exception {
        String OSName = System.getProperty("os.name");
        if (OSName.contains("Windows")) {
            dialog = new WindowsDialog();
        } else if (OSName.contains("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
    }

    public static void main(String[] args) throws Exception {
        initialize();
        dialog.render();
    }
}

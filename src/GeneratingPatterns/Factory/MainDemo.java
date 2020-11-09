package GeneratingPatterns.Factory;

public class MainDemo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}

package GeneratingPatterns.AbstractFactory;

public class MainDemo {

    private static Application application(){
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            guiFactory = new MacOSFactory();
            application = new Application(guiFactory);
        } else {
            guiFactory = new WindowsFactory();
            application = new Application(guiFactory);
        }
        return application;
    }

    public static void main(String[] args) {
        Application application = application();
        application.paint();
    }
}

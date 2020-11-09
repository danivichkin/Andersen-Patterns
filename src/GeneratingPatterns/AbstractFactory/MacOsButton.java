package GeneratingPatterns.AbstractFactory;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOS Button was created");
    }
}

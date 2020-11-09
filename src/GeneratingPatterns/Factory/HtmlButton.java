package GeneratingPatterns.Factory;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering HTML Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("CLICK-CLICK");
    }
}

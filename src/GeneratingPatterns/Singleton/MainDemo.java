package GeneratingPatterns.Singleton;

public class MainDemo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton secondSingleton = Singleton.getInstance("OOF");
        System.out.println(singleton.value);
        System.out.println(secondSingleton.value);

    }
}

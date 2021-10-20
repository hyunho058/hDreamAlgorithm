package khh.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonA singleton1 = SingletonA.getInstance();
        SingletonA singleton2 = SingletonA.getInstance();
        System.out.println(singleton1 == singleton2);

    }
}

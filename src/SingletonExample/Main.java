package SingletonExample;

public class Main {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        Singleton single1 = Singleton.getInstance();
        System.out.println(single.hashCode());
        System.out.println(single1.hashCode());
    }
}
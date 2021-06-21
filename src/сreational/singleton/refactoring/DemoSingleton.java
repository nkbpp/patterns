package сreational.singleton.refactoring;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("val1");
        Singleton s2 = Singleton.getInstance("val2");

        System.out.println(s1.getValue());
        System.out.println(s2.getValue());
    }
}

class Singleton{
    private static Singleton singleton;
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(singleton==null){
            singleton = new Singleton(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
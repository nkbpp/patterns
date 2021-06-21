package сreational.singleton;

public class Singleton1Test {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInctance();
        singleton1.printText();
    }
}

    //Ограничивает создание одного экземпляра класса, обеспечивает доступ к его
    // единственному объекту. Конструктор класса приватный. Метод getInstance()
    // создает только один экземпляр класса.

class Singleton1 {
    private static Singleton1 instance = null;
    private Singleton1() {}

    public static Singleton1 getInctance() {
        if(instance==null){
            instance = new Singleton1();
        }
        return instance;
    }

    public void printText(){
        System.out.println("text");
    }
}
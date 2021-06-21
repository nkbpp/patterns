package сreational.test;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getClass());

        A a = new A();
        System.out.println(a.getClass());

        A ac = new C();
        System.out.println(((B)ac).getClass());

        System.out.println(a instanceof C);

        Object o = new Object();

        System.out.println(o.getClass());

    }
}

class A implements Cloneable {
    String s1;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "A{" +
                "s1='" + s1 + '\'' +
                '}';
    }
}

class B extends A {

}

class C extends B {

}
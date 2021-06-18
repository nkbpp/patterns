package сreational.prototype;

public class Prototype {
    public static void main(String[] args) {
        Person person = new Person("Братчин", "Александр", "Владимирович", 27);

        Person person2 = (Person) person.copy();
        person2.age = 28;

        System.out.println(person.toString());
        System.out.println(person2.toString());

    }
}

interface Copyble{
    public Object copy();
}

class Person implements Copyble{
    String name;
    String fam;
    String otch;
    int age;

    public Person(String name, String fam, String otch, int age) {
        this.name = name;
        this.fam = fam;
        this.otch = otch;
        this.age = age;
    }

    @Override
    public Object copy() {
        return new Person(name, fam, otch, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fam='" + fam + '\'' +
                ", otch='" + otch + '\'' +
                ", age=" + age +
                '}';
    }
}
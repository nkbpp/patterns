package сreational.builder;

public class Builder {
    public static void main(String[] args) {
        Car car = new BuilderCar().setName("Жигуль").setSpeed(150).setRightRule(true).build();
        System.out.println(car.toString());

        Car car2 = new BuilderCar().setName("honda").setRightRule(true).build();
        System.out.println(car2.toString());
    }
}

class Car {
    private String name;
    private int speed;
    private boolean rightRule;
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setRightRule(boolean rightRule) {
        this.rightRule = rightRule;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", rightRule=" + rightRule +
                '}';
    }
}

interface InterfaceCar {
    public InterfaceCar setName(String name);
    public InterfaceCar setSpeed(int speed);
    public InterfaceCar setRightRule(boolean rightRule);
    public Car build();
}

class BuilderCar implements InterfaceCar {

    Car car = new Car();

    @Override
    public InterfaceCar setName(String name) {
        car.setName(name);
        return this;
    }

    @Override
    public InterfaceCar setSpeed(int speed) {
        car.setSpeed(speed);
        return this;
    }

    @Override
    public InterfaceCar setRightRule(boolean rightRule) {
        car.setRightRule(rightRule);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}

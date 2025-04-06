package TaskFirst;

public class Car extends Device{

    public Car(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Бип-бип");
    }
}

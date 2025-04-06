package TaskFirst;

public class Steamboat extends Device{

    public Steamboat(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Пыхтит");
    }
}

package TaskFirst;

public class Microwave extends Device{

    public Microwave(String name, String description) {
        super(name, description);
    }
    @Override
    public void sound() {
        System.out.println("Гудит");
    }
}

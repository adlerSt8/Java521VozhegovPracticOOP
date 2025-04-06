package TaskFirst;

public class Teapot extends Device{

    public Teapot(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Свистит");
    }
}

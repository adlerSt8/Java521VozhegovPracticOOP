package TaskFirst;

public abstract class Device {
    private final String name;
    private final String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void sound();
    public void show(){
        System.out.println("Название устройства: " + name);
    };
    public void desc(){
        System.out.println("Описание устройства: " + description);
    };
}

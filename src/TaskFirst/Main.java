package TaskFirst;

public class Main {
    public static void main(String[] args) {
        Device car = new Car("Автомобиль",
                "Транспортное средство с двигателем внутреннего сгорания или электрическим двигателем, " +
                        "предназначенное для перевозки людей и грузов по дорогам");

        Device microwave = new Microwave("Микроволновка", "Бытовой прибор для быстрого разогрева и " +
                "приготовления пищи с использованием микроволн");

        Device teapot = new Teapot("Чайник", "Прибор для кипячения воды, обычно с ручкой и " +
                "носиком для удобства наливания.");

        Device steamboat = new Steamboat("Пароход", "Cудно, движущееся с помощью паровой машины, " +
                "обычно используемое для перевозки людей и грузов по рекам или морям");

        //Автомобиль
        car.show();
        car.desc();
        car.sound();

        System.out.println("--------------------------------------------------------");

        //Микроволновка
        microwave.show();
        microwave.desc();
        microwave.sound();

        System.out.println("-----------------------------------------------------");

        //Чайник
        teapot.show();
        teapot.desc();
        teapot.sound();

        System.out.println("-----------------------------------------------------");

        //Пароход
        steamboat.show();
        steamboat.desc();
        steamboat.sound();
    }
}

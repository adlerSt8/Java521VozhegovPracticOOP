package TaskSecond;

public class Array implements IShow{
    private int[] numbers;

    public Array(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void print() {
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    @Override
    public void print(String info) {
        System.out.println();
        System.out.println("Сообщение: " + info);
        print();
    }
}

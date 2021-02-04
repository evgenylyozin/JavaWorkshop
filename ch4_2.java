import java.util.Arrays;

public class ch4_2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Arrays.fill(numbers, 1);

        System.out.println(Arrays.toString(numbers));

        int[] shortNumbers = Arrays.copyOfRange(numbers, 0, 2);
        System.out.println(Arrays.toString(shortNumbers));

        int[] longNumbers = Arrays.copyOf(numbers, 10);
        System.out.println(Arrays.toString(longNumbers));
    }
}

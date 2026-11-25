import java.lang.reflect.Array;
import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {

        int [] numbers = {8, 3, 6, 1, 9};

            for (int count = 0; count < 5; count++) {
                for (int value = 0; value < 5 - 1; value++) {
                    if (numbers[value] > numbers[value + 1]) {
                        int array = numbers[value];

                        numbers[value] = numbers[value+ 1];
                        numbers[value + 1] = array;
                    }
                }
            }
        System.out.println(Arrays.toString(numbers));

    }

}

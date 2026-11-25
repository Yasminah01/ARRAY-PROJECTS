import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder   {
    public static void main(String[] args){

         int [] numbers = {4,10,2,7,5};

            for (int count = 0; count < 5; count++) {
                for (int value = 0; value < numbers.length - 1; value++) {
                    if (numbers[value] < numbers[value + 1]) {
                        int array = numbers[value];

                        numbers[value] = numbers[value + 1];
                        numbers[value + 1] = array;
                    }
                }
            }


        System.out.println(Arrays.toString(numbers));
    }
}

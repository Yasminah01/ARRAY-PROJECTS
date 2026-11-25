import java.util.Arrays;

public class ComparingTwoArrays {
    static void main() {

        int [] numbers = {2, 5, 8, 10, 12, 15};
        int [] num = {5, 7, 10, 12, 20, 25};

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < num.length; j++){

                if (numbers[i] == num[j]) {

                    System.out.printf("%4d ", numbers[i]);
                }

            }
        }
    }
}

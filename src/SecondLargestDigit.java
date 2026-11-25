import java.util.Arrays;

public class SecondLargestDigit {
    static void main() {

        int [] numbers = {45, 12, 30, 45, 18, 25, 30, 10};
        int [] index = new int[1];
        int secondLargest = 0;

        for (int i = 0; i < 8; i++){
                if(index[secondLargest] < numbers[i]){
                    index[secondLargest] = numbers[8 - 1 - i ];
                    numbers[i] = secondLargest;
                }

        }
        System.out.print(Arrays.toString(index));

    }
}

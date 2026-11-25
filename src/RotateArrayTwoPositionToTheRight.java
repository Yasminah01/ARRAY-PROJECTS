import java.util.Arrays;

public class RotateArrayTwoPositionToTheRight {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] rotate = new int[5];
        int num = 0;

        for (int counter = 3; counter < 5; counter++) {
            rotate[num] = numbers[counter];
            num++;
        }

        for (int count = 0; count < 3; count++) {
            rotate[num] = numbers[count];
            num++;
        }

        System.out.println(Arrays.toString(rotate));
    }

}

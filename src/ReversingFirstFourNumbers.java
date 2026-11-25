import java.util.Arrays;

public class ReversingFirstFourNumbers {
    public static  void main(String[] args){

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] index = new int[6];
        int value = 0;

        for (int count = 3; count >= 0; count--) {
            index[value] = numbers[count];
            value++;
        }

        for (int count = 4; count <= 5; count++){
            index[count] = numbers[count];
            value++;
        }

        System.out.println(Arrays.toString(index));
    }
}

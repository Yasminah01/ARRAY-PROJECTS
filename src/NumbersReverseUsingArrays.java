import java.util.Arrays;

public class NumbersReverseUsingArrays {
    public static void main (String[] args){

        int [] numbers = {11, 22, 33, 44, 55, 66,};
        int [] index = new int [6];
        int num = 5;
//
//            for (int count = 0; count < 6; count++){
//                index[count] = numbers[6 - 1 -count];
//            }


                for (int counter = 5; counter >= 0; counter--) {

                        index[num] = numbers[counter];
                        num++;
                }
        System.out.println(Arrays.toString(index));

    }
}

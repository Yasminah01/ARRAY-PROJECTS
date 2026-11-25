import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AcceptingFiveElements {
    public static void main(String[] args){

        int [] elements = {12, 37, 19, 18, 9};
        int [] number = new int [5];

            for (int counter = 0; counter < 5; counter++){

                if (elements[counter] %2 != 0) {
                    number[counter] = elements[counter];
                }
            }
           System.out.println(Arrays.toString(number));



    }

}

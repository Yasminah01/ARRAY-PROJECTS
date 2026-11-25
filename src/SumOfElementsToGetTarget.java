import java.util.Arrays;

public class SumOfElementsToGetTarget {
    public static void main(String[] args){

        int [] elements = {2, 7, 11, 15, 3, 5, 6, 1};
        int target = 8;

            for (int i = 0; i < elements.length; i++) {
                for (int j = i+1; j < elements.length; j++){

                    if (elements[j] + elements[i] == target){
                        System.out.println(elements[i] + " and " + elements[j]);
                    }

                }

            }



    }
}

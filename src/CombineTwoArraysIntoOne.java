import java.util.Arrays;

public class CombineTwoArraysIntoOne {
    static void main() {
        int [] array1 = {2, 5, 8, 10, 12, 15};
        int [] array2 = {5, 7, 10, 12, 20, 25};
        int [] numbers = new int[12];
        int arrays = 0;

        for (int count = 0; count < array1.length; count++){
            numbers[arrays] = array1[count];
            arrays++;
        }

          for (int count = 0; count < array2.length  ; count++){
              numbers[arrays] = array2[count];
              arrays++;
          }
        System.out.println(Arrays.toString(numbers));
    }
}

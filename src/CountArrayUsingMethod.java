public class CountArrayUsingMethod {

    public static int countArray(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++){

            value++;
        }
        System.out.println(value );
       return value;
    }

    static void main() {
        int [] array = {34, 45, 67, 23, 34, 89, 90, 12};
        countArray(array);
    }
}






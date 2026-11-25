public class EnhancedLoop {
    static void main() {
        int [] numbers = {4, 5, 6, 10, 11};
        int total = 0;

        for (int num : numbers){
           total += num;
        }
        System.out.println(total);

        for (int num : numbers){
            total *= num;
        }
        System.out.println(total);

        for (int num : numbers){
            total /= num;
        }
        System.out.println(total);


    }
}

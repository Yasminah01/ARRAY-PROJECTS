import java.util.Scanner;
public class ScoresUsingArrays {
    static void main() {
        Scanner scanner = new Scanner(System.in);

//        int[] scores = {1,2,3,4,5,6,7,8,9};
//        for(int counter = 0; counter < 10; counter++){
//             System.out.print(scores[counter]);
//        }


//        int [] scores = new int[10];
//
//            for (int count = 0; count < 10; count++) {
//                System.out.println("Enter number: ");
//                int number = scanner.nextInt();
//                scores[count] = number;
//            }
//                for (int counter = 0; counter < 10; counter++) {
//                    System.out.println(scores[counter]);
//                }

//        int [] scores = new int[10];
//
//        for (int count = 0; count < 10; count++) {
//            System.out.println("Enter Number: ");
//            int num = scanner.nextInt();
//            scores[count] = num;
//        }


//            for (int counter = 0; counter < 10; counter++) {
//                if (counter % 2 != 0) {
//                    System.out.println(scores[counter]);
//                }
//
//            }


        int [] scores = new int[10];

        for (int count = 0; count < 10; count++) {
            System.out.println("Enter Number: ");
            int num = scanner.nextInt();
            scores[count] = num;
        }
            for (int count = 0; count < 10; count++){
                if (count == 3) {
                    scores[count] = scores[count] * 2;

                    System.out.println(scores[count]);
                }
            }
                for (int count = 0; count < 10; count++){
                    if (count == 7){
                        scores[count] = scores[count] * 2;

                        System.out.println(scores[count]);
                    }
                }

                   for (int count = 0; count < 10; count++){
                        if (count == 9){
                           scores[count] = scores[count] * 2;

                           System.out.println(scores[count]);
                        }
                   }


    }
}
public class TicTacToe {
    public static void main(String[] args) {

//        String[][] arrays =
//               {{"X", "O", "X"},
//                {"O", "X", "O"},
//                {"X", "O", "X"}};
        String[][] arrays = new String[3][3];
        String tic = "X";
        String tac = "O";

        for (int row = 0; row < arrays.length; row++) {
            for (int column = 0; column < arrays.length; column++) {

                if (row == 0 && column == 0) {
                    System.out.print(tic + " | ");
                }
                else if (row == 0 && column == 1) {
                    System.out.print(tac + " | ");
                }
                else if (row == 0 && column == 2) {
                    System.out.print(tic + " | ");
                }
                else if (row == 1 && column == 0) {
                    System.out.print(tac + " | ");
                }
                else if (row == 1 && column == 1) {
                    System.out.print(tic + " | ");
                }
                else if (row == 1 && column == 2 ) {
                    System.out.print(tac + " | ");
                }
                else if (row == 2 && column == 0) {
                    System.out.print(tic + " | ");
                }
                else if (row == 2 && column == 1) {
                    System.out.print(tac + " | ");
                }
                else if (row == 2 && column == 2){
                    System.out.print(tic + " | ");
                }
                else {
                    System.out.print(tic + " | ");
                }

            }

            System.out.println();
        }
    }
}

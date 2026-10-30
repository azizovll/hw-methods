import java.util.Scanner;

public class numberPatternGenerator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pattern = scanner.nextInt();
        int rows = scanner.nextInt();

        String fornow = "";

        if (pattern == 1) {
            fornow = "*";
            for (int i = 0; i < rows; i++) {
                System.out.println(fornow);
                fornow = fornow + "*";
            }

        }

        else if (pattern == 2) {

            for (int i = rows; i > 0; i--) {
                for (int j = i; j > 0; j--) {
                    fornow = fornow + "*";
                }
                System.out.println(fornow);
                fornow = "";

            }
        } else if (pattern == 3) {

            for (int i = 1; i <= rows; i++) {

                for (int j = 0; j < rows - i; j++) {
                    fornow = fornow + " ";
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    fornow = fornow + "*";

                }
                System.out.println(fornow);

                fornow = "";

            }
        } else if (pattern == 4) {

            for (int i = rows; i > 0; i--) {

                for (int j = 0; j < rows - i; j++) {
                    fornow = fornow + " ";
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    fornow = fornow + "*";

                }
                System.out.println(fornow);

                fornow = "";

            }
        }

    }

}
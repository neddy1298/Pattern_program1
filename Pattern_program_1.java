/**
 * Pattern_program_1
 */
public class Pattern_program_1 {

    public static void main(String[] args) {
        int baris = 5;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
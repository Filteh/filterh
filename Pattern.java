import java.util.*;
public class Pattern_3 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}

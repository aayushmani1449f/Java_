import java.util.*;
public class Patterns {
    static void main(String args[]) {

        // SOLID RECTANGLE

//        for (int i = 0; i<=m; i++) {
//            for (int j = 0; j<=n; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // HOLLOW RECTANGLE
//        int m = 7;
//        int n = 5;
//        for (int i = 1; i<=n; i++) {
//            for (int j = 1; j<=m; j++) {
//                if(i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }

        // INVERTED HALF PYRAMID
//        int m = 7;
//        for (int i = m; i>=1; i--) {
//            for (int j = 1; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        int n = 5;
        for (int i=1; i<=n; i++) { //outer loop
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.*;
// Non-primitive data type
public class Arrays {
    public static void main(String args[]) {
//        int[] marks = new int[5]; // Array initiate
//        int marks[] = new int[5];
//        marks[0] = 90;
//        marks[1] = 87;
//        marks[2] = 96;
//        marks[3] = 88;
//        marks[4] = 92;
//        for (int i = 0; i<=4; i++) {
//            System.out.println(marks[i]);
//        }

//        System.out.print("Enter number of elem''ents in array :");
          Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 1; i<=n; i++) {
//            System.out.print("Enter element "+i+" :");
//            arr[i-1] = sc.nextInt();
//        }
//        for (int j = 0; j<n; j++) {
//            System.out.print("Array elements are " + arr[j]);
//        }

//        Taking input in 2D array
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<column; j++) {
                System.out.print("Enter element "+i+j+" : ");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Elements of the 2D array are ");
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        //SEARCH FOR A NUMBER
        System.out.print("Enter number to search : ");
        int target = sc.nextInt();
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<column; j++) {
                if (target == arr[i][j]) {
                    System.out.println("Number found at indices "+i+j);

                }
            }
        }
    }


}

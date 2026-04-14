import java.util.*;

public class Functions {
    public static int add2num(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = add2num(x,y); //Function called
        System.out.println(sum);
    }
}

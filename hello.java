
import java.util.*;

class first {
    static void main(String args[]) {
//        System.out.println("Hello world");
//        System.out.println("Hey");
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
        //int a = 10;
        //int b = 20;
        //int sum = a+b;
        //System.out.println(sum)
        // System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
        //System.out.println(a/b);

        // very important for taking input into java
          Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("your name is "+ name);
        // Program to take 2 numbers as input and print their sum

        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of both numbers is " + sum);


    }
}
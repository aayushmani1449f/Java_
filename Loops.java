import java.util.*;

public class Loops {
    public static void main(String args[]) {
        for (int i = 0; i<10; i++) {
            System.out.println(i+1);
        }
        
        int i = 0;
        while (i<10) {
            System.out.println(i+1);
            i++;
        }

        do {
            System.out.println(i+1);
            i++;
        } while (i<10);
    }
}

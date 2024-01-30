package LOOPS.WHILE;
import java.util.*;
public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();

        int num = 0;

        while (n>0){
            int d = n%10;

            num = num*10 +d;

            n= n/10;
        }

        System.out.println(num);
    }
}

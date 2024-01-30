package LOOPS.WHILE;
import java.util.*;
public class sum_digi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();

        int sum =0;

        while(n>0){
            int d = n%10;

            sum+=d;

            n = n/10;
        }

        System.out.println(sum);
    }
}

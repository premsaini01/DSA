package LOOPS.WHILE;
import java.util.*;
public class count_digi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");

        int n = sc.nextInt();

        int count =0;

        while(n>0){
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}

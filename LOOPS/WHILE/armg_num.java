package LOOPS.WHILE;
import java.util.*;
public class armg_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();

        int og = n ;

        int num = 0;

        while (n>0){
            int d = n%10;

            num = num*10 +d;

            n= n/10;
        }

        if(og == num){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

package LOOPS;
import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int ft = 0;
        int st = 1;

        for(int i=1;i<=n;i++){
            System.out.println(ft);
            int sum = ft+st;
            ft=st;
            st = sum;
        }
    }
}

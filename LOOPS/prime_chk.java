package LOOPS;
import java.util.*;
public class prime_chk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();

        boolean flag = true;

        for(int i =2;i<n;i++){
            if(n%i==0){
                System.out.println("not a prime");
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("it is a prime");
        }

    }
}

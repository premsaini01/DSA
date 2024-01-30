package LOOPS;
import java.util.*;
public class power {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter number: ");
    int n = sc.nextInt();

    System.out.print("enter the power: ");
    int p = sc.nextInt();

    int mul = 1;

    for(int i =1;i<=p;i++){
        mul = n*mul;
    }

    System.out.println(mul);
   } 
}

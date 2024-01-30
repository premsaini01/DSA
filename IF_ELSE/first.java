import java.util.*;
public class first {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            if(n>0){
                System.out.println("this is a positive number");
            }else if(n<0){
                System.out.println("this is a negative number");
            }else{
                System.out.println("this is a zero");
            }
        }
    }
}

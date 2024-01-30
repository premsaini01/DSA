import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a month number: ");
        int n = sc.nextInt();

        if(n==1){
            System.out.println("jan");
        }else if(n==2){
            System.out.println("feb");
        }else if(n==3){
            System.out.println("march");
        }else if(n==4){
            System.out.println("april");
        }
    }
}

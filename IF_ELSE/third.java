import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a alphabaet: ");
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("this is a lowercase alphabet");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("this is a uppercase alphabet");
        }else{
            System.out.println("this is not a alphabet");
        }
    }
}

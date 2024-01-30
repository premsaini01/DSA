import java.util.*;
public class second {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a alphabet: ");

            char c = sc.next().charAt(0);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println("this is a vowel");
            }else{
                System.out.println("this is a consonant");
            }
        }
    }
}

package LOOPS;
import java.util.*;
public class count_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a sentence: ");

        String str = sc.nextLine();

        int count =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                count++;
            }
        }

        System.out.println("there is " + count + " vowels in this sentence");
    }
}

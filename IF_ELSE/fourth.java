import java.util.*;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter all three angles of a triangle: ");
        int fi = sc.nextInt();
        int se = sc.nextInt();
        int th = sc.nextInt();

        if(fi+se+th==180){
            System.out.println("this is a valid triangle");
        }else{
            System.out.println("this is a not a triangle");
        }
    }
}

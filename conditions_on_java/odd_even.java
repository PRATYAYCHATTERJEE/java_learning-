package conditions_on_java;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("The number is even");
        }
        if (n%2!=0) {
            System.out.println("The number you entered is odd");
            
        }
    }
}
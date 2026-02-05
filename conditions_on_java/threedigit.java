package conditions_on_java;
import java.util.Scanner;
public class threedigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(99<n && n<1000){
                System.out.println("this is a three digit number ");
        }
        else{
            System.out.println("not a three digit number");
        }
    }
    
}

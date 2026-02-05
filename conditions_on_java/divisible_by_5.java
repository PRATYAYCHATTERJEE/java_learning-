package conditions_on_java;
import java.util.Scanner;
public class divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("The is divisible by 5");
        }
        else{
            System.out.println("not divible by 5");
        }
    }
}

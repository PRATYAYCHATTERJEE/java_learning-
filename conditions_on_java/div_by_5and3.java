package conditions_on_java;
import java.util.Scanner;
public class div_by_5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("The number is divisible by 5 and 3 ");
        }
        else{
            System.out.println("not divisible by 3 and 5");
        }
    }
}

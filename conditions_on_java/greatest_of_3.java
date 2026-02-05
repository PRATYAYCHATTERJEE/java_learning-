package conditions_on_java;
import java.util.Scanner;
public class greatest_of_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number  ");
        int a= sc.nextInt();
        System.out.println("Enter the second number  ");
        int b= sc.nextInt();
        System.out.println("Enter the third number  ");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("first number  is largest number"+a);
        }
        if (b>a && b>c) {
            System.out.println("second number  is the largest number "+b);
        }
        if(c>a && c>b){
            System.out.println("third number is the largest number "+c);
        }
    }
    
}

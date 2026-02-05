package conditions_on_java;

import java.util.Scanner;

public class nested_largestofthree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number  ");
        int a= sc.nextInt();
        System.out.println("Enter the second number  ");
        int b= sc.nextInt();
        System.out.println("Enter the third number  ");
        int c= sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+"a is largest");
            }
            else{
                System.out.println(c+"c is largest");
            }
        }
        if(b>c){
                System.out.println(b+"is largest ");
        }
        else{
            System.out.println(c+"is largest");
        }
    }
}

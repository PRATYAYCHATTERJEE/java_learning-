package conditions_on_java;

import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int n =sc.nextInt();
        if(n<0){                 //if the number is negetive
                    n=n*(-1);
        }
        System.out.println("The absolute of n is :"+n);
        
    }
}


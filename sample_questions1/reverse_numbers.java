package sample_questions1;

import java.util.Scanner;

public class reverse_numbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0){
            int lastdigit= n%10;
            rev*=10;
            n/=10;
        }
        System.out.println(rev);
    }
}

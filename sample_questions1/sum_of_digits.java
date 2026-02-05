package sample_questions1;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            int lastdigit= n%10;
            sum+= lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
}

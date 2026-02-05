/*
A 
1 2 
A B C 
1 2 3 4 
A B C D E 
1 2 3 4 5 6 */



package sample_questions1;

import java.util.Scanner;

public class mixed_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Eneter n :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0) System.out.print(j+" ");
                else System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}

package objects;

import java.util.Scanner;

class Algebra{
    int add(int a,int b){
        int ans= a+b;
        return ans;
    }
}
public class sum {
  public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr the first number:");
        int x= sc.nextInt();
        System.out.print("Enetr the second number:");
        int y= sc.nextInt();

        System.out.print("Sum of input numbers is:");
        int ans=obj.add(x,y);
        System.out.print(ans);
  }  
}

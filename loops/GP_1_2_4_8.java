package loops;
import java.util.Scanner;
public class GP_1_2_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        int a=3, r=4;
        for (int i=1;i<=n;i++){
        System.out.println(a+" ");
        a*=r;
        }
    }
}


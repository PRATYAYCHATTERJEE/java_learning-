package loops;
import java.util.Scanner;
public class AP_1_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1;i<2*n-1;i+=2){
            System.out.println(i+" ");
        }
    }
}

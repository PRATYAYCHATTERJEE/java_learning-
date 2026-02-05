package loops;
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:-");
        int n = sc.nextInt();
        boolean flag = false;  // false means prime 
        for(int i =2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(n==1)
            System.out.println("Neither prime nor composite");
        else if(flag==false)
            System.out.println("prime number");
        else
            System.out.println("composite number ");
    }
}

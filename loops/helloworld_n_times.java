package loops;
import java.util.Scanner;
public class helloworld_n_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enere n : ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i=i+1){
            System.out.println("hello world");
        }
    }
}

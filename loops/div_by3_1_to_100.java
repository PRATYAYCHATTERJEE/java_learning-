package loops;
import java.util.Scanner;
public class div_by3_1_to_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value to n : ");
        int n = sc.nextInt();
        for(int i =1; i<=100; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}

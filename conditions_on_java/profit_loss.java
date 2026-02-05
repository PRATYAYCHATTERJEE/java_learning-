package conditions_on_java;
import java.util.Scanner;
public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost prize: ");
        int cp=sc.nextInt();
        System.out.println("Enter the selling prize :");
        int sp=sc.nextInt();
        if(sp>cp){
        
            System.out.print("Your profit is :");
            System.out.println(sp-cp);
        }


        else{
                    System.out.print("You made a loss");
                    System.out.println(cp-sp);
        }
    }  

}
 
package javainput;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //creating a scanner
        System.out.println("Enter radius:");  //printing
        int radius;
        radius = sc.nextInt();                  //enter a integer at sc
        double pi=3.1415;
        double area=pi*radius*radius;
        System.out.println("The area of circle is : "+area);
    
    
    }   


}

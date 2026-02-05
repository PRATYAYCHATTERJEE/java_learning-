package conditions_on_java;
import java.util.Scanner;
public class straightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1=1,x2=2,x3=3,y1=1,y2=2,y3=3;
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("the three points lies ona single line");
        }
        else{
            System.out.println("dont lie on a single line");
        }
    }
}

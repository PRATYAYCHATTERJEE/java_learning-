package conditions_on_java;

import java.util.Scanner;

public class area_perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght :");
        int length = sc.nextInt();
        System.out.println("Enter breadth :");
        int breadth= sc.nextInt();
        int area = length*breadth;
        int perimeter=2*(length+breadth);
        if(area>perimeter){
            System.out.println("area is greater than perimeter");
        }
        else if(area<perimeter){
            System.out.println("perimeter is greater than area ");
        }
        else{
            System.out.println("permeter and area is same ");
        }
    }
    
}

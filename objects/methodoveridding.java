package objects;

class Calculator{
    public int add(int a, int b, int c){
        return a+b;
    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, int b){
        return a+b;
    }
}


public class methodoveridding {

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int result=obj.add(3,4,5);
        System.out.println(result);
    }
}

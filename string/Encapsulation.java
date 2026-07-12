package string;

class human{
    
    //int age;
	//private int age=11;

    private int age;

    //String name;
	//private String name="Navin";

    private String name;
    
    public int getage(){
        return age;
    }

    public void setage(int a){
        age=a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {
        human obj=new human();
		obj.setage(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getage());
    }
}

package array;

public interface introduction {
    
    public static void main(String[] args) {

        /*                                 
        int nums[]={1,2,3};             //declare array
        nums[1]=6;                      //update array element
        System.out.println(nums[1]);      //print array element
        */

        int nums[]= new int[5];          //dynamicaly declare 
        nums[0]=2;
        nums[1]=3;
        nums[2]=4;
        nums[3]=5;
        nums[4]=6;

        for(int i=0;i<5;i++){                //printling using for loop
        System.out.println(nums[i]);
        }
    }
}

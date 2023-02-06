import java.util.*;
public class StringType{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String a = "HelloWorld";
        String b = "HelloWorld";

        String c = input.next();

        // This just checks the memory location of a string
        //as a and b are initialized and they hava same value so their memory location will be same

        // if (a == b){
        //     System.out.println("Initialized same value at different var will be same.");
        // }
        
        //here a and c has different memory location though their value are same
        //so it will tell a and c are different value on the basis of their memory location
        // if (a != c){
        //     System.out.println("Initialized value and input same value will not be same.");
        // }
        

        //This method just checks the value of the variable and return true if they are same.
        //despite their memory location
        // if (a.equals(c)){
        //     System.out.println("This funciton checked the value only.");
        // }


        //This is the inbuilt method of slicing in java
        // String sub = c.substring(0,5);
        // System.out.println(sub); 


    }
}
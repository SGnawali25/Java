import java.util.*;
public class StringType{

    public static String Upper(String str){
        StringBuilder finalStr = new StringBuilder("");
        // StringBuilder final = new StringBuilder("");
        // if (str.length() == 0) return final.toString();
        finalStr.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length() ; i++){
            if (str.charAt(i -1) == ' ' ){
                finalStr.append(Character.toUpperCase(str.charAt(i)));
            }else {
                finalStr.append(str.charAt(i));
            }
        }
        return finalStr.toString();
    }

    //This function compress the given string
    public static void StringCompress(String name){
        StringBuilder finalName = new StringBuilder("");
        finalName.append(name.charAt(0));
        int count = 1;
        for (int i = 1; i < name.length(); i++){
            if (name.charAt(i) == finalName.charAt(-1)){
                count += 1;
            }else{
                finalName.append(count.toString());
                finalName.append(name.charAt(i))
                count = 1;
            }
        }
        System.out.println(finalName.toString());
    }
    public static void main(String args[]){
        // Scanner input = new Scanner(System.in);
        // String a = "HelloWorld";
        // String b = "HelloWorld";

        // String c = input.next();

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


        //String Builder
        //if we use string builder then it makes string mutable and works like an array

        // String to uppercase

        // String check = "sandesh gnawali is my name.";
        // System.out.println(Upper(check));

        String name = "aaabccccdde";
        StringCompress(name);
    }
}
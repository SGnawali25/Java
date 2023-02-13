public class bit_manipulation_question {
    //This functions swap two variables without using third variable
    public static void swap(int first, int second){
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("The value of first is " + first + " and the value of second is " + second + ".");
    }

    //This function add 1 to provided integer using bit manipulation
    public static void add1(int num){
        System.out.println("The one more value of given num is " + -~num);
    }


    //from here main function starts
    public static void main(String[] args){
        //The value of xor of any num with itself is 0

        //swapping two variables without using third variable
        // swap(5,6);

        //This function add 1 to provided integer using bit manipulation
        add1(3);


    }
    
}

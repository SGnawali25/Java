public class bit_manipulation {
    public static void OddEven(int num){
        int bitMask = 1;
        if ((num & bitMask) == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String [] args){
        OddEven(111);

    }

}

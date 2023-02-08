public class bit_manipulation {

    //finding whether the number is odd or even using bit manipulation
    public static void OddEven(int num){
        int bitMask = 1;
        if ((num & bitMask) == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }

    //getting the ith bit of given number
    public static void getIthBit(int num, int i){
        int bitMask = 1<<i;
        if ((num & bitMask) == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    //Setting the ith element of a number to 1
    public static void setIthBit(int num, int i){
        int bitMask = 1 << i;
        System.out.println(bitMask | num );
    }

    //This functions clear the ith bit to 0
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return (bitMask & num) ;
    }

    //This function update the ith bit of given number to given bit
    public static void updateIthBit(int num, int i, int newBit){
        // if (newBit == 1){
        //     setIthBit(num,i);
        // }else{
        //     clearIthBit(num, i);
        // }

        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        System.out.println(num | bitMask);        
    }

    //This function clear the last i bit
    public static int clearLastIBit(int num, int i){
        // int bitMask = (~0)<<i;
        return num << i;
    }

    //This function clears the range of bit of given number
    public static int clearRange(int num, int i, int j){
        int a = (~0)<<(j + 1);
        int b = (1 << i) - 1;
        int bitMask = a|b;
        return num & bitMask;
    }
    public static void main(String [] args){
        // OddEven(111);

        // getIthBit(10,3);

        // setIthBit(5,2);

        // clearIthBit(10,1);

        // updateIthBit(10,2,1);

        // System.out.println(clearLastIBit(15,2));

        System.out.println(clearRange(10, 2, 4));
    }

}

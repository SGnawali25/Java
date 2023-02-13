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
        //It is because 2^i-1 gives i one in binary and from binary left shift we have
        //2^i == 1 << i so 2^i -1 == 1 << i - 1
        int bitMask = a|b;
        return num & bitMask;
    }

    //This function determine whether the input number is power of 2 or not
    public static boolean isPowerOfTwo(int num){
        //from binary number of power of 2 we observe following conclusion
        return (num & (num-1)) == 0;
    }

    //This fuction counts the set bit in a number
    public static int countSetsBit(int num){
        int count = 0;
        while (num > 0){
            int lsb = num & 1;
            if (lsb == 1){
                count += 1;
            }
            num = num >> 1;
        }
        return count;
    }

    //This fuctions helps to find the mth power of given number n
    public static int fastExponent(int num, int pow){
        int ans = 1;
        while (pow > 0 ){
            if ((pow & 1)!= 0){
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }
    public static void main(String [] args){
        // OddEven(111);

        // getIthBit(10,3);

        // setIthBit(5,2);

        // clearIthBit(10,1);

        // updateIthBit(10,2,1);

        // System.out.println(clearLastIBit(15,2));

        // System.out.println(clearRange(10, 2, 4));

        // System.out.println(isPowerOfTwo(15));

        // System.out.println(countSetsBit(16));
        //Try to grasp the runtime of countSetsBit function

        System.out.println(fastExponent(2,6));
    }

}

public class Recursion {
    
    public static void printInc(int num){
        if (num == 1){
            System.out.print(num);
            return;
        }
        System.out.print(num + " ");
        printInc(num-1);
    }

    public static void printDec(int num){
        if (num == 1){
            System.out.print(num + " ");
            return;
        }
        printDec(num-1);
        System.out.print(num + " ");
    }
    
    public static int factorial(int num){
        if (num == 1){
            return num;
        }
        return (num * factorial(num-1));

    }

    public static int dynamicFib(int num){
        if (num == 0){
            return num;
        }
        if (num == 1 ){
            return 1;
        }

        int first = 0;
        int second = 1;
        int fibNum = 0;

        for (int i = 0; i < num - 1; i++){
            fibNum = first + second;
            first = second;
            second = fibNum;
        }

        return fibNum;
    }

    public static int recursionFib(int num){
        if (num == 0 ){
            return 0;
        }
        if (num == 1){
            return 1;
        }

        int FibNum = recursionFib(num - 1) + recursionFib(num - 2);
        return FibNum;
    }

    public static boolean isSortedRec(int arr[], int index){
        if (index == arr.length - 1){
            return true;
        }

        if (arr[index] > arr[index + 1]){
            return false;
        }
        
        return isSortedRec(arr, index + 1);
    }

    public static int firstOccurence(int arr[], int key, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == key){
            return index;
        }

        return firstOccurence(arr, key, index + 1);
    }

    public static int lastOccurence(int arr[], int key, int index){
        if (index == -1){
            return -1;
        }

        if (arr[index] == key){
            return index;
        }

        return lastOccurence(arr, key, index - 1);
    }

    public static int power(int num, int pow){
        if (pow == 0){
            return 1;
        }

        return num * power(num, pow - 1);
    }

    public static int powerOpt(int num, int pow){
        if( pow == 0){
            return 1;
        }

        int powHand = powerOpt(num, pow/2);
        int powHandSqr = powHand * powHand;
        if (pow % 2 != 0){
            powHandSqr *= num;
        }
        return powHandSqr;
    }

    //Tiling Problem
    //The total area is 2 * n where n is provided by user
    //The area of single tile is 2*1
    public static int tilingProblem(int num){
        if (num ==0 || num == 1){
            return 1;
        }

        //vertical choice
        int fnm1 = tilingProblem(num -1);

        //horizontal choice
        int fnm2 = tilingProblem(num - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void binaryString(int num,int lastDigit, String finOut){
        if (num == 0){
            System.out.println(finOut);
            return;
        }

        binaryString(num - 1, 0, finOut + "0");

        if (lastDigit == 0){
            binaryString(num - 1, 1, finOut + "1");
        }



    }


    //This is main function
    public static void main(String[] args){
        // printInc(10);

        // printDec(10);

        // System.out.println(factorial(5));

        // int num = 20;
        // System.out.println(dynamicFib(num));
        
        // for (int i = 0; i <= 10; i++){
        // System.out.println(dynamicFib(i) + " - " + i);
        // }

        
        // int num = 0;
        // System.out.println(recursionFib(num));

        // int arr[] = {1,2,3,4,8,9,11,15,17,8};

        // System.out.println(isSortedRec(arr, 0));
            
        // System.out.println(firstOccurence(arr, 8, 0));

        // System.out.println(lastOccurence(arr, 8, 9));

        // System.out.println(power(2, 10));

        // System.out.println(powerOpt(2, 5));

        //Tiling problme
        // System.out.println(tilingProblem(4));

        // binaryString(3, 0, "");

        
        

    }

}

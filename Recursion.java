public class Recursion {
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
        
        

    }

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

    
}

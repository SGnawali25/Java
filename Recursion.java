public class Recursion {
    public static void main(String[] args){
        // printInc(10);

        printDec(10);

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
    
}

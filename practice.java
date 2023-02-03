import java.util.*;
import java.lang.Float;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of first item: ");
        float first_item = sc.nextInt();
        System.out.print("Enter the cost of second item: ");
        float second_item = sc.nextInt();
        System.out.print("Enter the cost of third item: ");
        float third_item = sc.nextInt();

        float total = first_item + second_item + third_item;
        
        System.out.println("The total cost of these items without tax is $" + total + ".");
        
        float tax = 0.18f * total;

        System.out.println("The tax amount is $" + tax + ".");

        System.out.print("The total cost after tax is $" + Float.sum(total,tax) + ".");


    }
}
import java.util.*;
import java.lang.Math;
import javax.swing.text.TabExpander;

public class JavaBasics {
    public static void main(String args[]) {
        // System.out.print("Hello World");

        // System.out.print("Hello World");
        // System.out.print("Hello World");
        // System.out.print("Hello World");

        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hello World");

        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n");

        // System.out.print("Hello World\nHi");
        // System.out.print("Hello World\n");
        // System.out.print("Hello World\n");


        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "Sandesh Gnawali";
        // System.out.println(name);


        // name = "Captain Sandesh Gnawali";
        // System.out.println(name);
        
        // a = 25;
        // System.out.println(a);

        //code to calculate sum in javs 

        // byte a = 5;
        // byte b = 13;
        // int total = a + b;
        // System.out.println(total);

        /*This way I am 
         * in a alpha batch 3.0
         * and able to write multi line comment
         */

         //learning input
         //before this i import java.util.* which i have written at the top of this 

        //  Scanner sc = new Scanner(System.in);
        //  String name = sc.next();
        //  System.out.println(name);

        //This just print the one word even if the multiple words are given

        // for multi word input

        // Scanner sc = new Scanner(System.in);
        
        //for string
        // String name = sc.nextLine();
        // System.out.println(name);

        //for int
        // int num = sc.nextInt();
        // System.out.println(num);

        //for boolean
        // boolean status = sc.nextBoolean();
        // System.out.println(status);

        // for short
        // short num = sc.nextShort();
        // System.out.println(num);

        //for float
        // float num = sc.nextFloat();
        // System.out.println(num);


        //mathematical operation using user provided data

        // Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();

        //calculate the sum of two input integer
        // int total = a + b ;
        // System.out.println(total);

        //calculate the product of two input num
        // float product = a * b;
        // System.out.println(product);

        //Taking the radius from the user and printing the area of a circle with the given radius
        // Scanner sc = new Scanner(System.in);
        // int radius = sc.nextInt();
        // float Area = 3.14f * radius * radius;

        //Note: If we didn't put f after 3.14 then it will give error
        // we can't do (22/7)f and (3.14)f

        // System.out.println(Area);

        //Type Conversion basics 
        // Scanner sc = new Scanner(System.in);
        // float number = sc.nextInt();
        // System.out.println(number);

        //But we cannot convert float to integer

        // int a = 5;
        // float b = a;
        // System.out.println(b);


        //Type Casting
        //Forcefully converting one datatype to another with the loss of some data.
        
        //Following example works 
        // float a = 3.14f;
        // int b = (int)a;
        // System.out.println(b);

        //Type Promotion in Expression

        // int a = 5;
        // char b = 'a';
        // short c = 3;
        // int sum = a + b + c;
        // System.out.println(sum);


        //Though char can be calculated as it is converted to int ascii value
        // System.out.println(b);

        // int a = 5;
        // float b = 6.0f;
        // long c = 10;
        // double d = 4;
        // double sum = a + b + c + d;
        // System.out.println(sum);

        //When we use expression then it convert to max storage data type like 
        // the order is int, long, float, double
        //if int is only used then we can get final expression as int which we can store in int, long, float, double variable
        // if double is the largest then we can't store the expression in int we need double type variable

        //extra
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);
        // System.out.println(b);

        // byte a = 2;
        // short b = 5;
        // int c = 18;
        // short sum = (short)(a + b + c);
        // System.out.println(sum);

        // int x,y,z;
        // x= y= z = 2;
        // x += y;
        // y -= z;
        // z = z/ 4;
        // System.out.println(x + " " + y + " " + z);


        //int x = 4;
        // x += 3.5;
        // this expression is equivalent to x = (int)(x + 3.5)

        // float x  = 10;
        // float y = 3;
        // float final =(float) x / y;
        // System.out.println(final);


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income. ");
        // int income = sc.nextInt();
        // float tax;
        //  if (income <= 500000){
        //     tax = 0;
        //  }
        //  else{
        //     if (income > 1000000){
        //         tax =(float) ((income - 1000000) * 0.3 + 500000 * 0.2); 
        //     }
        //     else{
        //         tax = (float)((income - 500000) * 0.2);
        //     }
        //  }
              
        // System.out.println("The total tax you need to pay for your income " + income + " is " + tax + ".");
         

        //print the largest of the three given numbers:

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // int first_num = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int second_num = sc.nextInt();
        // System.out.print("Enter the third number: ");
        // int third_num = sc.nextInt();

        // if (first_num > second_num && first_num > third_num){
        //     System.out.println(first_num + " is the largest among three.");
        // }
        // else if (second_num > third_num){
        //     System.out.println(second_num + "is the largest among three.");
        // }
        // else{
        //     System.out.println(third_num + "is the largest among three.");
        // }
        
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int num = 5;
        // String type = ((num % 2) == 0)? "Even" : "Odd";
        // System.out.println("The number is " + type);

        //practice for switch
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // int first = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int second = sc.nextInt();
        // System.out.print("Enter the operator: ");
        // String num = sc.next();
        // switch (num) {
        //     case "+": System.out.println("You choose to add.");
        //               int sum = first + second;
        //               System.out.println("The sum of given two number is " + sum);
        //               break;
        //     case "-": System.out.println("You choose to subtract.");
        //               int diff = first - second;
        //               System.out.println("The sum of given two number is " + diff);
        //               break;
        //     case "*": System.out.println("You choose to multiply.");
        //               int mul = first * second;
        //               System.out.println("The sum of given two number is " + mul);
        //               break;
        //     case "/": System.out.println("You choose to divide.");
        //              int div = first / second;
        //              System.out.println("The sum of given two number is " + div);
        // }
        
        //Function 1
        // printHelloWorld();
        // printHelloWorld();

        //Function 2
        // System.out.println(printHelloWorld());

        //Function 3
        // Binary to Decimal
        //Import java.lang.Math;

        // Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // System.out.println("The decimal number of " + num + " is " + bin_to_dec(num) + ".");

        //Function 4
        //Decimal to Binary
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("The binary number of " + num + " is " + dec_to_bin(num) + ".");




    }
    //Function 1
    // public static void printHelloWorld(){
    //     System.out.println("Hello World!");
    //     return;
    // }

    //Function 2
    // public static String printHelloWorld(){
    //     return "Hello World!";
    // }

    //Function 3 Binary to decimal

    // public static int bin_to_dec(int bin_num){
    //     int dec_num = 0;
    //     int pow = 0;
    //     while(bin_num > 0){
    //         int rem = bin_num % 10;
    //         dec_num = dec_num + rem * (int)Math.pow(2, pow);

    //         pow++;
    //         bin_num = bin_num / 10;
    //     }

    //     return dec_num;
    // }

    //Function 4 Decimal to Binary

    public static int dec_to_bin(int dec_num){
        int pow = 0;
        int bin_num = 0;
        while (dec_num > 0){
            int rem = dec_num % 2;
            bin_num = bin_num + rem * (int)Math.pow(10,pow);

            pow++;
            dec_num = dec_num / 2;
        }
        return bin_num;
    }


} 


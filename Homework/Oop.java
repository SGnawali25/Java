package Homework;

public class Oop {
    public static void main(String[] args){
        Complex first = new Complex(2,3);
        Complex second = new Complex(3,2);
        first.addition(second);
        first.subtraction(second);
        first.product(second);
    }

    
}


class Complex{
    int real;
    int imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void addition(Complex b){
        int totalReal =  this.real + b.real ;
        int totalComplex = this.imaginary + b.imaginary;
        String sign = totalComplex<0? " " : " + ";
        System.out.println("The sum of given complex number is " + totalReal + sign + totalComplex + "i.");
    }

    void subtraction(Complex b){
        int totalReal =  this.real - b.real ;
        int totalComplex = this.imaginary - b.imaginary;
        String sign = totalComplex<0? " " : " + ";
        System.out.println("The difference of given complex number is " + totalReal + sign + totalComplex + "i.");
    }

    void product(Complex b){
        int totalReal = (this.real * b.real) - (this.imaginary * b.imaginary);
        int totalComplex = (this.real * b.imaginary) + (this.imaginary * b.real);
        String sign = totalComplex<0?" ":" + ";
        System.out.println("The product of given complex number is " + totalReal + sign + totalComplex + "i.");
    }
    
}
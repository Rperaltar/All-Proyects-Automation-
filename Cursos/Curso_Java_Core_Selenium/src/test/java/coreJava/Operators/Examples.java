package coreJava.Operators;

public class Examples {

    public static void main(String[] args) {
        int a;
        int b = 10;
        int c = 5;
        int d = 16;

        a = b + c + d;
        System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
        a = b - c - d;
        System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
        a = b * c;
        System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
        a = b / c;
        System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
        a = b % c;
        System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
        b++;
        System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
        c--;
        System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);
    }
    /*
        Output

        Value of 'a' after '+' Arithmetic operation is 15

        Value of 'a' after '-' Arithmetic operation is 5

        Value of 'a' after '*' Arithmetic operation is 50

        Value of 'a' after '/' Arithmetic operation is 2

        Value of 'a' after '%' Arithmetic operation is 0

        Value of 'b' after '++' Arithmetic operation is 11

        Value of 'c' after '--' Arithmetic operation is 4
     */
}

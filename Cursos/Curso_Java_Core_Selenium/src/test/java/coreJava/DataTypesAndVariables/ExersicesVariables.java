package coreJava.DataTypesAndVariables;

public class ExersicesVariables {

    public static void main(String[] args) {

    //Example:1
        System.out.println("Hello World");
          /*
           Hello World
          */
    }
    //Example:2
    static  {
        int a = 10;
        double b = 20.3;
        double c = 3.14785;
        double d = a + b;

        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
        System.out.println("The value of c is : " + c);
        System.out.println("The value of c is : " + d);

      }
         /*
         The value of a is : 10
         The value of b is : 20.3
         The value of c is : 3.14785
         */

    //Example:3
    static  {
        boolean value = true;
        value = false;
        System.out.println("The value for the Boolean variable is : "+ value);

  }

        /*
        The value for the Boolean variable is : false
        */

    //Example:4
    static  {
        String HELLO_WORD  = "Hello word";
        System.out.println("The value for the String variable is : " + HELLO_WORD);
    }
        /*
        The value for the Boolean variable is : false
        */

    //Example:5
    static  {
        char a;
        a = 'B';
        System.out.println("The value for the String variable is : " + a );
    }
        /*
        The value for the Boolean variable is : a
        */
}

package CoreJava.DataTypesAndVariables;

public class VariablesTypeInteger {

    public static void main(String[] args) {

        //Use the int keyword to declare integer variable
        int carSpeed;
        int test;

        //Initialize the integer variable with value 20
        carSpeed = 20;
        test = 300000000;

        //Print the value of integer variable
        System.out.println("Car is running at the speed of: " +  carSpeed + ":" + test);

        //Change the value of integer variable
        carSpeed = test + carSpeed;

        //Print the value of integer variable
        System.out.println("Current speed of the car is: " +  carSpeed);

    }

        /* Result Print
        Car is running at the speed of: 20
        Current speed of the car is: 40
        */
}

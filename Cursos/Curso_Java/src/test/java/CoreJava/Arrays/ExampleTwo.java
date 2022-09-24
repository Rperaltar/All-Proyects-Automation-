package CoreJava.Arrays;

public class ExampleTwo {

    public static void main(String[] args) {
        String[] sMake = ReturnArray();
        for(int i = 0;i<=sMake.length-1;i++){
            System.out.println("Printing all the values of an Array ==> " + sMake[i]);
        }
    }

    //This method returns an Array of type String
    public static String[] ReturnArray() {
        String[] sArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
        return sArray;
    }

}

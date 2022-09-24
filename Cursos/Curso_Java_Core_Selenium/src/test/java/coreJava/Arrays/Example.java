package coreJava.Arrays;

public class Example {

    public static void main(String[] args) {
        String [] sMake = {
                "BMW",
                "AUDI",
                "TOYOTA",
                "SUZUKI",
                "HONDA"
        };

        //This is to store the size of the Array
        int iLength = sMake.length;
        System.out.println("Length of the Array is ==> " + iLength);

        //This is to access the first element of an array directly with it's position
        String sBMW = sMake[0];
        System.out.println("First value of the Array is ==> " + sBMW);

        //This is to access the last element of an Array
        String sHonda = sMake[iLength-1];
        System.out.println("Last value of the Array is ==> " + sHonda);

        //This is to print all the element values of an Array
        for(int i = 0;i<=iLength-1;i++){
            System.out.println("The value stored at position "+i+" in aMake array is ==> " + sMake[i]);
        }

        for (int i = 0; i < iLength; i++) {
            if (sMake[i].contains("A")){
                System.out.println("Las palabras que contienen A son: "+sMake[i]);
            }
        }

        String sToyota = sMake[2];
        System.out.println("Middle value of the Array is ==> " + sToyota);
    }
}

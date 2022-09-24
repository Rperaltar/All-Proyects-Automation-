package CoreJava.ClassConstructors;

public class ExampleConstructor {

    //Metodo de tipo publico que contendra las funciopnalid
    public static class Car {
        //Class Member Variables & Fields

        int iGear;
        int iHighestSpeed;
        int iMake;
        int iTyres;
        int iDoors;
        String sModel;
        String sColor;
        String sTransmission;
        boolean bLeftHandDrive;

        //Constructor with values passed
        public Car(String Model, int Make,boolean LeftHandDrive ){
            sModel = null;
            iMake = Make;
            bLeftHandDrive = LeftHandDrive;
        }

        //Method
        public void DisplayCharacterstics(){
            System.out.println("Model of the Car: " +  sModel);
            System.out.println("Number of gears in the Car: " +  iGear);
            System.out.println("Max speed of the Car: " +  iHighestSpeed);
            System.out.println("Color of the Car: " +  sColor);
            System.out.println("Make of the Car: " +  iMake);
            System.out.println("Transmission of the Car: " +  sTransmission);
        }
      }
    }

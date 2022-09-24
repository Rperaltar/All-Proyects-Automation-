package coreJava.DecisionMaking;

public class Example_if {

    public static void main(String[] args){

        {
        }
        String sDay = "Sunday";
        int iDay = 7;

        if(sDay == ("Sunday")){
            System.out.println("Today is Sunday");
        }
        if(iDay == 7){
            System.out.println("Today is Sunday");
        }
        if(sDay.equals("Sunday")){
            System.out.println("Today is Sunday");
        }
        if(sDay.contains("Sun")){
            System.out.println("Today is Sunday");
        }
    }
}

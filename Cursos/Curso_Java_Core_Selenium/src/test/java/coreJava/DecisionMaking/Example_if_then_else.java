package coreJava.DecisionMaking;

public class Example_if_then_else {

    public static void main(String[] args){

        String sDay = "Saturday";
        int iDay = 6;

        if(sDay.equals("Sunday")){
            System.out.println("Today is Sunday");
        }else{
            System.out.println("Today is not Sunday");
        }
        if(sDay.contains("tur")){
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is not Sunday");
        }
        if(sDay == ("Sunday")){
            System.out.println("Today is Sunday");
        }else{
            System.out.println("Today is not Sunday");
        }
        if(iDay == 6){
            System.out.println(sDay);
        }else{
            System.out.println("Today is not Sunday");
        }
    }
}

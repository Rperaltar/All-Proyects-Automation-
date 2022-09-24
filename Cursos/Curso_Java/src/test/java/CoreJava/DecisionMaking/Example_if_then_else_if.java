package CoreJava.DecisionMaking;

public class Example_if_then_else_if {

    public static void main(String[] args){

        {
        String sDay = "Monday";
        int iDay = 1;

        if(sDay.equals("Sunday")){
            System.out.println("Today is Sunday");

        }else if(sDay.equals("Saturday")){
            System.out.println("Today is not Saturday");
        }else{
            System.out.println("Today is a Monday");
        }

        if(iDay==7){
            System.out.println("Today is Sunday");
        }else if(iDay==1){
            System.out.println("Today is Monday");
        }else{
            System.out.println("Today is a Weekday");
      }
    }
  }
}

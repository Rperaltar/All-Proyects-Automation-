package CoreJava.Loops;

public class Example_While_Loop {

    public static void main(String[] args) {

        int Count = 10;
        // This will print -- 5,10,15,20,25
        while(Count < 25){
            Count = Count + 1;
            System.out.println("Count is ==> "+ Count);
        }

        int CountOnce = 25;
        System.out.println("<==== Next Count ====>");
        // This will not print count even once
        while(CountOnce < 25){
            CountOnce = CountOnce + 5;
            System.out.println("Count is ==> "+ CountOnce);
        }
    }
}

package Casting;

public class CastingDemo1 {
    public static void main(String[] args) {
        double no1=25.78;
        System.out.println(no1);//Matching Info 25.78

        int no2=(int) no1;// narrowing --> Forceful
        System.out.println(no2); //25

        double no3=30;// widening --> automatic
        System.out.println(no3); //30.0


    }
}

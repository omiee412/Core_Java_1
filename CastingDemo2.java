package Casting;

public class CastingDemo2 {
    public static void main(String[] args) {
        // double to float
        float f1= (float) 65.789456123;
        System.out.println(f1); //65.78946

        float f2= 25.256f;
        System.out.println(f2); //25.256

        //float to int

        int no1= (int) f2; // narrowing
        System.out.println(no1);// 25
    }
}

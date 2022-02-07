package Casting;

public class CastingDemo3 {
    public static void main(String[] args) {
        short s1=4582;
        int s2=s1;
        System.out.println(s2); //Automatic Casting(Widening)

        short s3=(short) 2596875; //narrowing
        System.out.println(s3); //Garbage value -24565

        byte b1=(byte) 12556; // narrowing
        System.out.println(b1); //Garbage value 12

    }
}

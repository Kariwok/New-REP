package practice;
/*
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
*/
public class PrimitiveType {
    public static void main(String[] args) {

        //Double primitive type practice

        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 13.13;
        System.out.println(doubleValue);

        //Integer
        int ninInValue=Integer.MIN_VALUE;
        System.out.println(ninInValue);

        int firstVariable =200;
        int secondVariable =400;

        System.out.println(Integer.max(firstVariable,secondVariable));
        System.out.println(Math.max(firstVariable,secondVariable));
        System.out.println(Integer.compare(firstVariable,secondVariable));

        //String
        String myName="Karinka";
        String mysurname = "Kulakova";

        //Karina Kulakova

        System.out.println(myName+""+mysurname);
        System.out.printf("%s %s\n,myName,mysurname");

        //Boolean

        boolean isStudent=true;
        boolean iswoomen=false;
        System.out.println(isStudent);

    }
}
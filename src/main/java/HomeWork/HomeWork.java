package HomeWork;

import java.sql.SQLOutput;

public class HomeWork {
    public static void main(String[] args) {
        //Double

        double sumOfNumbers = 3.5 + 2.5;
        System.out.println(sumOfNumbers);

        double justOneNumber = 7;
        System.out.println(justOneNumber);

        double severalNumbers = 3 + justOneNumber;
        System.out.println(severalNumbers);

        double mathExample = sumOfNumbers + justOneNumber;
        System.out.println(mathExample);

        double firstNumber, secondNumber, totalAmount;
        firstNumber = 10;
        secondNumber = 5;
        totalAmount = firstNumber + secondNumber;
        System.out.println(firstNumber + secondNumber);
        System.out.println(totalAmount);

        // Float primitive type practice

        float priceOfBlackBread = 0.80f;
        System.out.println(priceOfBlackBread);

        float Min_Value = Float.MIN_VALUE;
        System.out.println(Min_Value);

        float Max_Value = Float.MAX_VALUE;
        System.out.println(Max_Value);

        float floatValue = 10.9f;
        System.out.println(floatValue);

        float value1 = 5.2f;
        float value2 = 1.1f;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value1+value1);
        System.out.println(value1+value2);

        float value3 = 2.5f;
        System.out.println(value3);
        System.out.println(value1 + value3);
        System.out.println(value3-value2);

        //int

        int a_variable = 50;
        int b_variable = 70;

        System.out.println(Integer.max(a_variable, b_variable));
        //System.out.println(Integer.sum(a_variable+b_variable));
        System.out.println(Integer.compare(50, 70));
        System.out.println(Integer.compare(a_variable, b_variable));
        System.out.println(Integer.compare(a_variable, a_variable));
        System.out.println(Integer.compareUnsigned(a_variable,b_variable));
        System.out.println(Integer.hashCode(b_variable));
        System.out.println(Integer.hashCode(a_variable));
        System.out.println("a_variable:");

        //string

        String myName = "Karinka";
        String myLastName = "Kulakova";
        System.out.println(myName);
        System.out.println("Karinka");

        System.out.println(myName + " " + myLastName);
        System.out.println("   "+myName+"   "+myLastName);
        System.out.println(myName+myLastName);

        System.out.printf("%s %s\n", myName, myLastName);


        //StringBuilder sb = perevorachivajet slovo

        //Boolean

        boolean is_Female=true;
        boolean is_Java_Easy=false;
        System.out.println(is_Female);
        System.out.println(is_Java_Easy);
        System.out.println("true");

        long veryBigNumber = 125452125;

        }
}
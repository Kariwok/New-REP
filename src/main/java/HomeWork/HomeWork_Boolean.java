package HomeWork;

import java.util.Scanner;

public class HomeWork_Boolean {
    public static void main(String[] args) {
        //Picca
        String smallSize = "S";
        System.out.println(smallSize);

        String mediumSize = "M";
        System.out.println(mediumSize);

        String bigSize = "L";
        System.out.println(bigSize);

        //Prices of picas below:
        int sSize = 5;
        System.out.println("Price of your small size is: " + sSize);

        int mSize = 7;
        System.out.println("Price of medium size is: " + mSize);

        int lSize = 10;
        System.out.println("Price of big size is: " + lSize);

        boolean lsize = true;
        if (lsize) {
            System.out.println("Please take that small Pica");
        } else {
            System.out.println("Take medium or big");
        }

        int yourMoney=9;
        boolean yourOrder= true;
        if (lSize<yourMoney){
            System.out.println("Take it");
        } else {
            System.out.println("Take medium or big");
        }
    }
}
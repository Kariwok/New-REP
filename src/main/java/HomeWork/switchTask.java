package HomeWork;

import javax.swing.plaf.basic.BasicBorders;
import java.sql.SQLOutput;

public class switchTask {
    public static void main(String[] args) {
       int car = 1;
       //int trollejbus;
       switch (car) {
           case 1:
               String parking = "Jelgavas street";
               System.out.println("Start from home parking: " + parking);
           case 2:
               String trasa = "Jelgava-Riga";
               System.out.println("TIme to Riga about 45 km: " + trasa);
               //break;
           case 3:
               String bridge = "southBridge";
               System.out.println("Go throut Zepcik and turn to the "+ bridge);
           default:
               System.out.println("You need to go but be careful");

       }
       //Just for fun
       //Colors
        System.out.println("*********");
       int colors=2;
       switch (colors){
           case 1:
           String colorYellow = "yellow";
           System.out.println("It is: " + colorYellow);
           case 2:
               String colorRed = "red";
               System.out.println("It is: " + colorRed);
           case 3:
               String colorBlue = "blue";
               System.out.println("It is " + colorBlue);
           default:
               System.out.println("All colors are nice!");

       }



    }
}
package HomeWork;

public class Virkne {
    private static String[] args;

    public static void main(String[] args) {
        //Task AUT-06
        int numberWithTwoZero = 100;
        for (int i = 0; i <= numberWithTwoZero; i++) {
            //if ((x + 1) == numberWithTwoZero);
            System.out.print((i) + ",");
        }

        //Task AUT=02
        //В переменной типа int хранится любое число от 18 до 65.
        // Скидку в химчистке можно получить группе лиц от 18-21 лет в размере 10 процентов.
        // Группе лиц от 22 до 65 лет можно получить скидку в размере 15%.
        // Группе лиц от 65 можно получить скидку в размере 20%.
        int person1 = 18;
        int person2 = 21;
        int person3 = 22;
        int person4 = 23;
        int person6 = 65;
        //10% discount
        if (person1 < person3) {
            System.out.println("You have received a 10% discount");
        } else {
            System.out.println("You have received a 20% discount");
        }
        // 20% doscount
        if (person4 > person6) {
            System.out.println("You have received a 15% discount");
        } else {
            System.out.println("You have received a 20% discount");
        }
        System.out.println("_____");

//IF / ELSE IF / ELSE
        if (person1 > person3) {
            System.out.println("You have received a 10% discount");
        } else if (person4 < person6) {
            System.out.println("You have received a 15% discount");
        } else {
            System.out.println("You have received a 20% discount");

        }

        System.out.println("*********");
        System.out.println("2-nd variant");
        int age = 75;
        if (age <= 17) {
            System.out.println("You are too small");}
        else if (age >= 18 && age <= 21) {
            System.out.println("You have received a 10% discount");}
        else if (age >= 22 && age <= 65) {
            System.out.println("You have received a 15% discount");}
        //else if (age >= 66 && age <=99);{
            //System.out.println("bbbbb");
        else {
            System.out.println("age >= 66 && age <=99, therefore You have received a 20% discount");}
        }
    }
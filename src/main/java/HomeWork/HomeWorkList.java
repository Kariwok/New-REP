package HomeWork;

import java.util.Arrays;

public class HomeWorkList {
    public static void main(String[] args) {
        //Task_1 - int
        int task1 = 10;
        System.out.println("Integer value is 10");

        //Task_3 - Create a massive of 10 animals
        String[] animals = {"dog", "cat", "camel", "tiger", "hamster", "snake", "sheep", "cow"};

        System.out.println(animals);
        System.out.println(Arrays.toString(animals));
        System.out.println(animals[3]);

        //for each: shows all animals of the list
        for (String allAnimals : animals) {
            System.out.println(allAnimals);
        }

        for (String animal : animals) {
            if (animal.equals("cat")) {
                System.out.println("Yeah, I found a cat!!!");
            }
        }
        //TASK NR.4
        //Massive with numbers, show just odder numbers

        int[] evenNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 2; i < evenNumbers.length; i++) {
            if (i % 2 == 0) {
                //System.out.println(Arrays.toString(evenNumbers));
                System.out.print(i + ",");
            }

        }
    }
}

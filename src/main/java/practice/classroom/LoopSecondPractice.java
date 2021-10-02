package practice.classroom;

public class LoopSecondPractice {
    public static void main(String[] args) {
        int i=0;
        while (i<10) {
            System.out.println("Hello World");
            i++;
        }
boolean isStudent =true;
        System.out.println("It is not a student");
        isStudent = true;

        for (int y=5; y>=0; y--) {
            System.out.println(y);
        }
        //chisla v massive
        int [] nums = {30, 10, 20, 10, 40}; //110
        int b=0;
        int sum=0;
        while (b<nums.length) {
            sum = sum + nums[b];
            b = b+1;
        }
        System.out.println("Sum of the numbers:" + sum);
 // do something  while (boolean)
        int counter = 20;
         do {
             System.out.println("Current number is: " + counter);
             counter--;
         } while (counter>1);
         }
    }

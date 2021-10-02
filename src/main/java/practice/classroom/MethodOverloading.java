package practice.classroom;

public class MethodOverloading {
    public static void main(String[] args) {

    }
    public static void printInformation (String name){
        System.out.println("Your name is: " + name);
    }
    public static void printInformation (String name, int age){
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
    }
}

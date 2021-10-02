package practice.classroom.Objects;

public class Main {
    public static void main(String[] args) {

        Person noArgPerson = new Person();

        Person john = new Person("Nikita", "Milka");
        john.retrieveInformation();

        System.out.println();

        Person andrey = new Person("Andrey", "Chebupelli");
        andrey.setAge(21);
        System.out.printf("Andrey's age is: %d\n", andrey.getAge());
        andrey.setWeight(60.3);
        andrey.setHetero(false);
        andrey.retrieveInformation();

        System.out.println();

        Person angelica = new Person("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();

    }
}
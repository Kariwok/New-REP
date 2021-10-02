package HomeWork;

public class HomeWork_2 {
    public static void main(String[] args) {
        String name = "Karinka";
        String surname = "Kulakova";
        String birthCity = "Jelgava";
        String babies = "two babies";
        String baby1 = "boy";
        String baby2 = "girl";
        String placeOfWork = "Riga";
        String workingHours = "8:00-17:00";
        int yearsOld = 37;
        int birthYear = 1983;

        System.out.println("My name is: " + name + " " + surname + "." + " I am" + " " + yearsOld + " " + "years old"
                + "." + " I have" + " " + babies + "." + "They are: " + baby1 + " " + "and" + " " + baby2 + "." + " My native city is " + birthCity + "," + "but I am working in" + " "
                + placeOfWork + "." + " EveryDay at " + workingHours + " I am in office.");

        //Format commands
        String nameAndUserName = String.format("%s %s \n\n", name, surname);
        System.out.println(nameAndUserName);

        String myKids = String.format("%s %s \n", baby1, baby2+"\n");
        System.out.println(myKids);

        String workingPlace = String.format("%s \n", placeOfWork);
        System.out.println(workingPlace);
    }
}

package HomeWork;

public class multiplicationTable {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i <= table.length; i++) {
            for (int x = 1; x <= table.length; x++) {
                System.out.println((i * x) + ",");
            }
        }
    }
}

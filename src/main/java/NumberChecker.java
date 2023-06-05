
public class NumberChecker {
    public static String checkNumber(int number) {
        if (number % 13 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }
}
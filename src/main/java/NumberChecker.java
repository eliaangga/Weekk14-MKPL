package src.main.java;

public class NumberChecker {
    public static String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }
}
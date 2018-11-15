import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberReader {

    private Scanner scanner;

    public NumberReader() {
        scanner = new Scanner(System.in);
    }

    public float readNextFloat(String variableName) {
        float nextFloat;
        try {
            System.out.println("Podaj wartość " + variableName);
            nextFloat = scanner.nextFloat();
        } catch (InputMismatchException e) {
            String next = scanner.next();
            System.out.println("To nie jest liczba: "+ next + ". Podaj wartość liczbową!");
            return readNextFloat(variableName);
        }
        return nextFloat;
    }
    public void scannerClose() {
        scanner.close();
    }
} 
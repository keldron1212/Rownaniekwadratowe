import java.util.Scanner;

public class NumberReader {

    private Scanner scanner;

    public NumberReader() {
        scanner = new Scanner(System.in);
    }

    public float readNextFloat(String variableName) {
        System.out.println("Podaj wartość " + variableName);
        //TODO Sprawdzanie czy na pewno liczba
        return scanner.nextFloat();
    }

    public void scannerClose() {
        scanner.close();
    }
} 
package Calculator;

import java.util.Scanner;

public class KeyboardReader {
    Scanner scanner = new Scanner(System.in);

    double scanNumber() {
        return scanner.nextDouble();
    }

    String scanOperation() {
        return scanner.next();
    }
}

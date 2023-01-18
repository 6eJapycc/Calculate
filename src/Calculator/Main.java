package Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ConsoleWriter consoleWriter = new ConsoleWriter();
        KeyboardReader keyboardReader = new KeyboardReader();

        while (true) {
            consoleWriter.writeText("Enter number 1");
            double num1 = keyboardReader.scanNumber();
            consoleWriter.writeText("Enter number 2");
            double num2 = keyboardReader.scanNumber();
            consoleWriter.writeText("Enter operation type");
            String operation = keyboardReader.scanOperation();

            OperationBox operationBox = new OperationBox(num1, num2, operation);

            OperationBox result = calculator.calculate(operationBox);
            consoleWriter.writeCalculationResult(result.getResult());
        }
    }
}

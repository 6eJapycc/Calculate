package Calculator;

public class Calculator {

    OperationBox calculate(OperationBox operationBox) {

        switch (operationBox.getOperation()) {
            case "sum":
                double result1 = operationBox.getNum1() + operationBox.getNum2();
                operationBox.setResult(result1);
                return operationBox;
            case "sub":
                double result2 = operationBox.getNum1() - operationBox.getNum2();
                operationBox.setResult(result2);
                return operationBox;
            case "mul":
                double result3 = operationBox.getNum1() * operationBox.getNum2();
                operationBox.setResult(result3);
                return operationBox;
            case "div":
                double result4 = operationBox.getNum1() / operationBox.getNum2();
                operationBox.setResult(result4);
                return operationBox;
        }
        return operationBox;
    }

}

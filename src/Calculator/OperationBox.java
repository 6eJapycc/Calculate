package Calculator;

public class OperationBox {

    private double num1;
    private double num2;
    private double result;
    private String operation;

    public OperationBox(double num1,double num2,String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

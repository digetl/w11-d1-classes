public class Calculator {
    private int numberOne;
    private int numberTwo;

    private double numberOneDouble;
    private double numberTwoDouble;

    public Calculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne(){
        return numberOne;
    }

    public int getNumberTwo(){
        return numberTwo;
    }
}

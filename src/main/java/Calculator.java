public class Calculator {
    private int numberOne;
    private int numberTwo;

    private double numberOneDouble;
    private double numberTwoDouble;

    public Calculator(int numberOne, int numberTwo, double numberOneDouble, double numberTwoDouble) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberOneDouble = numberOneDouble;
        this.numberTwoDouble = numberTwoDouble;
    }

    public int getNumberOne(){
        return numberOne;
    }

    public int getNumberTwo(){
        return numberTwo;
    }

    public double getNumberTwoDouble(){
        return numberTwoDouble;
    }

    public double getNumberOneDouble(){
        return numberOneDouble;
    }

    public int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
}

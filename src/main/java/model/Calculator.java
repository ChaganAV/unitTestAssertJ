package model;

public class Calculator {
    private double summa;
    private double discont;

    public Calculator() {
    }
    public double calculateDiscount(double sum, double discont ){
        double result = sum - discont;
        if(result< 0) {
            throw new ArithmeticException("Скидка не может быть больше суммы");
        }
        return result;
    }
}

package model;

public class Calculator {
    private double summa;
    private int discont;

    public Calculator() {
    }
    public double calculateDiscount(double sum, int discont ){
        double resultDiscont = sum * discont / 100;
        double result = sum - resultDiscont;
        if(result< 0) {
            throw new ArithmeticException("Скидка не может быть больше суммы");
        }
        return result;
    }
}

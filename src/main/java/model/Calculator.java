package model;

import static org.assertj.core.api.Assertions.*;
public class Calculator {
    private double summa;
    private int discont;

    public Calculator() {
    }
    public double calculateDiscount(double sum, int discont ){
        double resultDiscont = sum * discont / 100;
        double result = sum - resultDiscont;
        assertThat(result).isPositive();
        //assertThat(result).isPositive().isInstanceOf(ArithmeticException.class);

        //if(assertThat(result).isNegative()) throw new ArithmeticException("Скидка не может быть больше суммы");
        return result;
    }
}

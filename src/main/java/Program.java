import model.Calculator;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        assert 5 == calculator.calculateDiscount(25,5);
    }
}

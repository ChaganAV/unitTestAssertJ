import model.Calculator;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double sum = 25;
            int disc = 5;
            //assert 5 == calculator.calculateDiscount(sum, disc);
            System.out.printf("Стоимость %.2f, скидка %d, ваша сумма со скидкой составляет %.2f",
                    sum, disc, calculator.calculateDiscount(sum, disc));
            System.out.println();
            sum = 25;
            disc = 105;
            //assert 5 == calculator.calculateDiscount(sum, disc);
            System.out.printf("Стоимость %.2f, скидка %d, ваша сумма со скидкой составляет %.2f",
                    sum, disc, calculator.calculateDiscount(sum, disc));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int payment1 = (int) (service.calculate(1_000_000, 12, 9.99));
        int payment2 = (int) (service.calculate(1_000_000, 24, 9.99));
        int payment3 = (int) (service.calculate(1_000_000, 36, 9.99));

        System.out.println("Ежемесячный платеж: " + payment1 + " руб.");
        System.out.println("Ежемесячный платеж: " + payment2 + " руб.");
        System.out.println("Ежемесячный платеж: " + payment3 + " руб.");

    }
}

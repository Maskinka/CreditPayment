public class CreditPaymentService {
    public double calculate(int sum, int months, double percent) {

        double MonthPercent = (percent * .01) / 12;
        //double payment = sum * ((MonthPercent * Math.pow(( 1 + MonthPercent), months)) / (Math.pow(( 1 + MonthPercent), months) -1 ));
        double annutet = (MonthPercent * Math.pow((1 + MonthPercent), months)) / (Math.pow((1 + MonthPercent), months) - 1);
        int payment = (int) (sum * annutet);

        return payment;
    }
}

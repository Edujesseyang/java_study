
public class futureValue {

    public static void main(String[] args) {
        int investment = 1000;
        int years = 30;
        double growthRate = 0.1;

        double rawFutureValue = calcFutureValue(investment, years, growthRate);
        double futureValue = Math.round(rawFutureValue * 100) / 100.0;
        System.out.println(futureValue);
    }

    public static double calcFutureValue(int monthlyInvestment, int years, double annualGrowthRate) {
        int month = years * 12;
        double monthGrowthRate = annualGrowthRate / 12;
        return monthlyInvestment * (Math.pow((1 + monthGrowthRate), month) - 1) / monthGrowthRate;
    }
}

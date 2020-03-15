import java.math.BigDecimal;

public class StudentCalculate implements ICalculateRates {
    @Override
    public BigDecimal calculateReduction(BigDecimal rate) {
        BigDecimal studentValue = new BigDecimal("5.50");
        BigDecimal studentRed = new BigDecimal("0.25");
        if (rate.compareTo(studentValue) <= 0) {
            return rate;
        }
        else
            return ((rate.subtract(studentValue).multiply(studentRed).add(studentValue)));

    }
}

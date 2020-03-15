import java.math.BigDecimal;

public class VisitorCalculate implements ICalculateRates {

    @Override
    public BigDecimal calculateReduction(BigDecimal rate) {
        BigDecimal visitorFree = new BigDecimal("8");
        BigDecimal visitorReduction = new BigDecimal("0.50");
        if (rate.compareTo(visitorFree) == -1) {
            return BigDecimal.ZERO;
        }
        else
            return ((rate.subtract(visitorFree)).multiply(visitorReduction));
    }
}

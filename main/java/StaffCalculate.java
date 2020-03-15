import java.math.BigDecimal;

public class StaffCalculate implements ICalculateRates {
    @Override
    public BigDecimal calculateReduction(BigDecimal rate) {
        BigDecimal staffMaxPay = new BigDecimal("16");
        if (rate.compareTo(staffMaxPay) >= 0) {
            return staffMaxPay;
        }
        else
            return rate;
    }
}

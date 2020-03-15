import java.math.BigDecimal;

public class ManagementCalculate implements ICalculateRates {

    @Override
    public BigDecimal calculateReduction(BigDecimal rate) {
        BigDecimal manageMinPay = new BigDecimal("3");
        if (rate.compareTo(manageMinPay) == -1){
            return manageMinPay;
        }
        else
            return rate;
    }

}

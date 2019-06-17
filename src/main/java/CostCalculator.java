import java.math.BigDecimal;

public class CostCalculator {

    private BigDecimal costOfOneSms ;

    public CostCalculator(BigDecimal costOfOneSms) {
        this.costOfOneSms = costOfOneSms;
    }

    public BigDecimal calculate (int amount) {
        return costOfOneSms.multiply(BigDecimal.valueOf(amount)) ;
    }





}


import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class CostCalculatorTest {

    @Test
    public void correctness_of_calculations() {
        CostCalculator cc = new CostCalculator(BigDecimal.valueOf(15));
        BigDecimal calculate = cc.calculate(6);
        assertEquals(BigDecimal.valueOf(15 * 6), calculate);
    }
}

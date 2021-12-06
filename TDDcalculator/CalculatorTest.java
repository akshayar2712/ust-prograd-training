import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setup() {
        cal = new Calculator();
    }

    @Nested
    class TestingAddFunction {
        @Test
        public void FifteenPlusFiveIsFifteen() {
            double answer = cal.add(15, 5);
            double expected = 20;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void NegativeTenPlusFiveIsNegativeFive() {
            double answer = cal.add(-10, 5);
            double expected = -5;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void TenPlusZeroIsFive() {
            double answer = cal.add(10, 0);
            double expected = 10;
            Assertions.assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingSubFunction {
        @Test
        public void TenMinusFiveIsFive() {
            double answer = cal.sub(10, 5);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void NegativeTenMinusFiveIsNegativeFifteen() {
            double answer = cal.sub(-10, 5);
            double expected = -15;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void EightMinusNineIsNegativeOne() {
            double answer = cal.sub(8, 9);
            double expected = -1;
            Assertions.assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingMulFunction {
        @Test
        public void TenMultiplyFiveIsFifty() {
            double answer = cal.mul(10, 5);
            double expected = 50;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void NegativeTenMultiplyFiveIsNegativeFifty() {
            double answer = cal.mul(-10, 5);
            double expected = -50;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void TenMultiplyZeroIsZero() {
            double answer = cal.mul(10, 0);
            double expected = 0;
            Assertions.assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingDivFunction {
        @Test
        public void TenDividedTwoIsFive() {
            double answer = cal.div(10, 2);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void NegativeTenDividedByFiveIsNegativeTwo() {
            double answer = cal.div(-10, 5);
            double expected = -2;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void throwExceptionWhenDividedByZero() {
            Assertions.assertThrows(ArithmeticException.class, () -> cal.div(10, 0));
        }
    }
}

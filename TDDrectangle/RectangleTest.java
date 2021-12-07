import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle ar;
    @BeforeEach
    public void setup(){
        ar = new Rectangle();
    }
    @Nested
    class RectangleArea{
        @Test
        public void checkAreaIsSixtyWhenLengthIsTwoAnDBreadthIsThirty(){
            double actualarea = ar.area(2,30);
            double expectedarea = 60;
            Assertions.assertEquals(actualarea,expectedarea);
        }

        @Test
        public void throwExceptionWhenMeasurementsBecomeNegative(){
            Assertions.assertThrows(ArithmeticException.class, () -> ar.area(-5,-4));
        }

        @Test
        public void checkAreaIsThirtyTwoPointFiveWhenLengthIsSixPointFiveAndBreadthIsFive(){
            double actualarea = ar.area(6.5,5);
            double expectedarea = 32.5;
            Assertions.assertEquals(actualarea,expectedarea);
        }
    }
}

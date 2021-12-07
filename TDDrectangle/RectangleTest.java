import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Nested
    class TestingRectangleArea {
        @Test
        public void checkAreaIsSeventyTwoWhenLengthIsTwelveAndBreadthIsSix() {
            Rectangle area = new Rectangle(10, 6);
            double answer = area.area();
            double expected = 60;
            Assertions.assertEquals(answer, expected);
        }


        @Test
        public void checkAreaIsTwentyNinePointSixWhenLengthIsSevenPointFourAndBreadthIsFour() {
            Rectangle area = new Rectangle(7.4, 4);
            double answer = area.area();
            double expected = 29.6;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumberException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle area = new Rectangle(-2, 0);
                area.area();}
            );
        }
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;

public class RectangleTest {

    @Nested
    class TestingRectangleArea {
        @Test
        public void checkAreaIsSeventyTwoWhenLengthIsTwelveAndBreadthIsSix() {
            Rectangle area = new Rectangle(10, 6);
            double actualArea = area.area();
            double expectedArea = 60;
            Assertions.assertEquals(actualArea, expectedArea);
        }


        @Test
        public void checkAreaIsTwentyNinePointSixWhenLengthIsSevenPointFourAndBreadthIsFour() {
            Rectangle area = new Rectangle(7.4, 4);
            double actualArea = area.area();
            double expectedArea = 29.6;
            Assertions.assertEquals(actualArea, expectedArea);
        }

        @Test
        public void areaOfNegativeNumberException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle area = new Rectangle(-2, 0);
                area.area();}
            );
        }
    }

    @Nested
    class TestingRectanglePerimeter {
    @Test
        public void checkPerimeterIsEighteenIfLengthFourAndBreadthFive(){
            Rectangle perimeter = new Rectangle(4,5);
            double actualPerimeter = perimeter.perimeter();
            double expectedPerimeter = 18;
            Assertions.assertEquals(actualPerimeter, expectedPerimeter);
    }
    @Test
    public void checkPerimeterForDecimalMeasurements(){
        Rectangle perimeter = new Rectangle(4.5,5.6);
        DecimalFormat df = new DecimalFormat("#.#");
        double actualPerimeter = perimeter.perimeter();
        double expectedPerimeter = 20.2;
            Assertions.assertEquals(df.format(actualPerimeter), df.format(expectedPerimeter));
    }
    @Test
    public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            Rectangle perimeter = new Rectangle(-2, 0);
            perimeter.perimeter();}
        );
    }
    }
}
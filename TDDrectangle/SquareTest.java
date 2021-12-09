import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @Test
    public void checksErrorWhenSideIsNegative(){
        assertThrows(IllegalArgumentException.class,() -> new Square(-4));
    }

    @Test
    public void checksErrorWhenSideIsZero(){
        assertThrows(IllegalArgumentException.class,()-> new Square(0));
    }

    @Nested
    class AreaTest{

        @Test
        public void checksAreaIsTwentyFiveWhenSideIsFive(){
            square = new Square(5);
            double actualArea = square.area();
            double expectedArea = 25;
            assertEquals(expectedArea,actualArea);
        }
    }

    @Nested
    class PerimeterTest{

        @Test
        public void checksPerimeterIsTwentyWhenSideIsFive(){
            square = new Square(5);
            double actualPerimeter= square.perimeter();
            double expectedPerimeter = 20;
            assertEquals(expectedPerimeter,actualPerimeter);

        }
    }

}
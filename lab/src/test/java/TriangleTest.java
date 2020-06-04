import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void isTriangleExist() {
        Triangle triangle = new Triangle();
        Boolean actual = triangle.isTriangleExist(67,4,5);
        Boolean expected = false;
        assertEquals(expected, actual);


    }
}
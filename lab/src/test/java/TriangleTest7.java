import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest7 {

    @Test
    void isTriangleExist() {
        Triangle triangle = new Triangle();
        Boolean actual = triangle.isTriangleExist(1,233,1);
        Boolean expected = true;
        assertEquals(expected, actual);


    }
}
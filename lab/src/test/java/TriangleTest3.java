import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest3 {

    @Test
    void isTriangleExist() {
        Triangle triangle = new Triangle();
        Boolean actual = triangle.isTriangleExist(9,12,5);
        Boolean expected = true;
        assertEquals(expected, actual);


    }
}
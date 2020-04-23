import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest8 {

    @Test
    void isTriangleExist() {
        Triangle triangle = new Triangle();
        Boolean actual = triangle.isTriangleExist(Math.sqrt(121),Math.sqrt(9),Math.sqrt(64.01));
        Boolean expected = true;
        assertEquals(expected, actual);


    }
}
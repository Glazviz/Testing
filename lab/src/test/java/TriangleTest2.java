import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest2 {

    @Test
    void isTriangleExist() {
        Triangle triangle = new Triangle();
        Boolean actual = triangle.isTriangleExist(-3,-4,-5);
        Boolean expected = false;
        assertEquals(expected, actual);


    }
}
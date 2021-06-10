import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testClassifyTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }    @Test
    void testClassifyTriangle4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
}
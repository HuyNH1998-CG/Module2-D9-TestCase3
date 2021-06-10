public class TriangleClassifier {
    public static String classifyTriangle(int sideA, int sideB, int sideC) {
        String outcome = "";
        boolean isTriangle = sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
        if (sideA == 0 || sideB == 0 || sideC == 0) {
            outcome = "Không phải là tam giác";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            outcome = "Tam giác cân";
            if (sideA == sideC && sideB == sideC) {
                outcome = "Tam giác đều";
            }
        } else if (isTriangle) {
            outcome = "Tam giác thường";
        } else {
            outcome = "Không phải là tam giác";
        }
        return outcome;
    }
}

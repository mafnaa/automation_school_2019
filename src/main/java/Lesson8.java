public class Lesson8 {
    public static String findCommonParts(int a, int b, int c, int d) {
        String result = "";
        if (a < b | c < d) return "ERROR";
            for (int i = a; i < b; i++) {
                for (int j = c + 1; j < d; j++) {
                    if (i == j) {
                        result = String.format("%s%d ", result, j);
                    }
                }
            }
        return result.trim();
    }
}

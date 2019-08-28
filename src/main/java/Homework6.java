
class Homework6 {
    public String calculateArea(String form, double a, double b, double c) {
        switch (form) {
            case "triangle":
                if (a + b > c && b + c > a && a + c > b) {
                    double s = (a + b + c) / 2;
                    return String.format("%.2g", Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                } else return "Wrong triangle";
            case "rectangle":
                return String.format("%.2f", a * b);
            case "circle":
                return String.format("%.2f", 3.14 * a * a);
            default:
                return "Wrong type";
        }
    }
}
import java.util.Scanner;

class SimpleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long fact = 1;
        int j = 1;
        int result = 0;
        do {
            fact = 1;
            for (int i = 1; i <= j; i++) {
                fact = fact * i;
            }
            j++;
            result++;
        }
        while (num >= fact);
        System.out.println(result);
    }
}

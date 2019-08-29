class Homework7 {
    public int returnSum(int a, int b) {
        if (a > b) return 0;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
class solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        solution1(arr);
    }

    public static double solution1(int[] arr) {
        double answer = 0;

        int total = 0;

        for (int i : arr) {
            total += i;
        }

        answer = (double) total / arr.length;

        return answer;
    }
}

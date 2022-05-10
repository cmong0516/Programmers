import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
                { 0, 0, 0, 3 } };
        solution(m, n, picture);
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        for (int i = 0; i < picture.length; i++) {
            System.out.println("i === " + i);
            for (int j = 0; j < picture[0].length; j++) {
                System.out.println("j = " + j);
            }
        }

        return answer;
    }
}

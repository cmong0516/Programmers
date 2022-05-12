import java.util.Arrays;

public class Solution {

    static int temp_cnt = 0;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
                { 0, 0, 0, 3 } };
        solution(m, n, picture);
    }

    static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        boolean[][] check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !check[i][j]) {
                    numberOfArea++;
                    dfs(i, j, picture, check);
                }
                if (temp_cnt > maxSizeOfOneArea) {
                    maxSizeOfOneArea = temp_cnt;
                }
                temp_cnt = 0;
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }

    static void dfs(int x, int y, int[][] picture, boolean[][] check) {
        if (check[x][y]) {
            return;
        }

        check[x][y] = true;

        temp_cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) {
                continue;
            }
            if (picture[x][y] == picture[nx][ny] && !check[nx][ny]) {
                dfs(nx, ny, picture, check);
            }

        }

    }

}

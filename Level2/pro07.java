public class Solution {
    public static void main(String[] args) {
        int[] progresses = { 95, 90, 99, 99, 80, 99 };
        int[] speeds = { 1, 1, 1, 1, 1, 1 };
        solution(progresses, speeds);
    }

    static int[] solution(int[] progresses, int[] speeds) {

        int[] temp = new int[100];
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            temp[day]++;
        }

        int cnt = 0;

        for (int t : temp) {
            if (t != 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        cnt = 0;

        for (int t : temp) {
            if (t != 0) {
                answer[cnt++] = t;
            }
        }

        return answer;
    }
}

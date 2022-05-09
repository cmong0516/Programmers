package Level1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int N = 5;
        int[] stage = { 2, 1, 2, 6, 2, 4, 3, 3 };
        Solution s = new Solution();
        s.solution(N, stage);
    }

    public int[] solution(int N, int[] stages) {
        // 실패율은 다음과 같이 정의한다.
        // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        int[] answer = new int[N];
        List<double[]> failperList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {

            int chalenger = 0;
            int failer = 0;
            double failper = 0;
            for (int stage : stages) {
                if (stage >= i) {
                    chalenger++;
                }
                if (stage == i) {
                    failer++;
                }
                failper = (double) failer / (double) chalenger;
                if (chalenger == 0) {
                    failper = 0;
                }
            }
            failperList.add(new double[] { i, failper });
        }
        failperList.sort((a, b) -> Double.compare(b[1], a[1]));
        for (int i = 0; i < failperList.size(); i++) {
            answer[i] = (int) failperList.get(i)[0];
        }
        return answer;
    }
}
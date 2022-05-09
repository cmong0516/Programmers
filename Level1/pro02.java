package Level1;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;
        for (int i : lottos) {
            if (i == 0) {
                zero++;
            } else {
                for (int j : win_nums) {
                    if (i == j) {
                        match++;
                        break;
                    }
                }
            }
        }

        int min = match;
        int max = match + zero;

        int[] answer = { Math.min(7 - max, 6), Math.min(7 - min, 6) };
        return answer;
    }
}
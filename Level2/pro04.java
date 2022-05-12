public class Solution {

    int answer = 0;
    String[] persons = { "A", "C", "F", "J", "M", "N", "R", "T" };

    public static void main(String[] args) {
        int n = 2;
        String[] data = { "N~F=0", "R~T>2" };
        Solution s = new Solution();
        System.out.println(s.solution(n, data));
    }

    public int solution(int n, String[] data) {

        boolean[] isVisited = new boolean[8];
        dfs("", isVisited, data);

        return answer;
    }

    void dfs(String names, boolean[] isVisited, String[] data) {
        // 조건만족시 ++;
        if (names.length() == 7) {
            if (check(names, data)) {
                answer++;
            }
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                String name = names + persons[i];
                dfs(name, isVisited, data);
                isVisited[i] = false;
            }
        }
    }

    // 조건 체크
    public static boolean check(String names, String[] data) {
        for (String d : data) {
            int to = names.indexOf(d.charAt(0));
            int from = names.indexOf(d.charAt(2));
            char how = d.charAt(3);
            int far = d.charAt(4) - '0';
            if (how == '=') {
                if (!(Math.abs(to - from) == far + 1))
                    return false;
            } else if (how == '>') {
                if (!(Math.abs(to - from) > far + 1))
                    return false;
            } else if (how == '<') {
                if (!(Math.abs(to - from) < far + 1))
                    return false;
            }
        }
        return true;
    }
}

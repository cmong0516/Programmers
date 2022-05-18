import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                String last = stack.peek();
                String cur = String.valueOf(s.charAt(i));
                if (!last.equals(cur)) {
                    stack.push(cur);
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
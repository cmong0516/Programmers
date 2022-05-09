package Level1;

import java.util.ArrayList;
import java.util.Collections;

class solution {
    public static void main(String[] args) {
        solution(125);
    }

    public static int solution(int n) {
        int answer = 0;
        int a = 3;
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }

        Collections.reverse(list);

        System.out.println("list.get(0) = " + list.get(0));

        for (int i = 1; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
            answer = answer + (a * list.get(i));
            a *= 3;
        }
        answer += list.get(0);

        System.out.println("answer = " + answer);
        return answer;
    }
}
import java.util.*;

class solution {
    public static void main(String[] args) {
        String[] strings = { "abce", "abcd", "cdx" };
        solution1(strings, 2);
    }

    public static String[] solution1(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string.charAt(n) + string);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }

}
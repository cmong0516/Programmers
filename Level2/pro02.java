import java.util.ArrayList;
import java.util.HashMap;

class solution {
    public static void main(String[] args) {
        String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
                "Change uid4567 Ryan" };
        solution(record);
    }

    public static String[] solution(String[] record) {

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] split = record[i].split(" ");
            if (split[0].equals("Enter")) {
                list.add(split[1] + "님이 들어왔습니다.");
                map.put(split[1], split[2]);
            }
            if (split[0].equals("Leave")) {
                list.add(split[1] + "님이 나갔습니다.");
            }
            if (split[0].equals("Change")) {
                map.put(split[1], split[2]);
            }
        }
        // System.out.println("list = " + list);
        // System.out.println("map = " + map);

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i).indexOf("님");
            String id = list.get(i).substring(0, index);
            // System.out.println("id = " + id);
            answer[i] = map.get(id) + "님이 " + list.get(i).split(" ")[1];
        }
        // System.out.println("answer = " + Arrays.toString(answer));
        return answer;
    }
}

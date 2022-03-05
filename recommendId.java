class Solution {
    public String solution(String new_id) {

        System.out.println("id = " + new_id);
        new_id = new_id.toLowerCase();
        System.out.println("id = " + new_id);
        String id = "";
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                id += String.valueOf(ch);
            } else if (ch >= '0' && ch <= '9') {
                id += String.valueOf(ch);
            } else if (ch == '.' || ch == '-' || ch == '_') {
                id += String.valueOf(ch);
            }
        }
        System.out.println("id = " + id);
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) == '.') {
                int j = i + 1;
                String dot = ".";

                while (j != id.length() && id.charAt(j) == '.') {
                    dot += ".";
                    j++;
                }
                if (dot.length() > 1) {
                    id = id.replace(dot, ".");
                }
            }
        }

        if (id.startsWith(".")) {
            id = id.substring(1, id.length());
        } else if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }

        if (id.length() == 0) {
            id += "a";
        }

        if (id.length() >= 16) {
            id = id.substring(0, 15);
        }

        if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }

        if (id.length() == 2) {
            id += id.charAt(id.length() - 1) + "";
        } else if (id.length() == 1) {
            id = id + id.charAt(id.length() - 1) + id.charAt(id.length() - 1) + "";
        }
        String answer = id;
        return answer;
    }
}
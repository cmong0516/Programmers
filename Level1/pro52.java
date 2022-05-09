package Level1;

import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        solution1(phone_number);
    }

    public static String solution1(String phone_number) {
        String answer = "";

        String front = phone_number.substring(0, phone_number.length() - 4).replaceAll(".", "*");

        answer = front + phone_number.substring(phone_number.length() - 4);

        return answer;
    }
}

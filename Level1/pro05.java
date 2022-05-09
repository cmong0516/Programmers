package Level1;

class Solution {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = number;
            } else {
                int leftLength = getLength(left, number);
                int rightLength = getLength(right, number);

                if (leftLength > rightLength) {
                    sb.append("R");
                    right = number;
                } else if (leftLength < rightLength) {
                    sb.append("L");
                    left = number;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = number;
                    } else {
                        sb.append("L");
                        left = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getLength(int index, int number) {

        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }
}
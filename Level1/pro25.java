import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = { 46, 33, 33, 22, 31, 50 };
        int[] arr2 = { 27, 56, 19, 14, 14, 10 };

        solution1(n, arr1, arr2);
    }

    public static String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        // 런타임 에러!!
        // 원인 binary 코드로 변환한 값을 Integer 가 아니라 Long 으로 받아서 해결.
        for (int i = 0; i < arr1.length; i++) {

            String binaryArr1 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            String binaryArr2 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            StringBuilder sb = new StringBuilder();
            // System.out.println("binaryArr1 = " + binaryArr1);
            // System.out.println("binaryArr2 = " + binaryArr2);
            for (int j = 0; j < n; j++) {
                if (binaryArr1.charAt(j) == '1' || binaryArr2.charAt(j) == '1') {
                    sb.append("#");
                }
                if (binaryArr1.charAt(j) == '0' && binaryArr2.charAt(j) == '0') {
                    sb.append(" ");
                }
            }
            answer[i] = String.valueOf(sb);

        }
        // System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}
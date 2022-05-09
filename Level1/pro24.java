package Level1;

class solution {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 4;

        solution1(a, b, c);
    }

    public static long solution1(int price, int money, int count) {
        long answer = -1;

        // int 로 해서 에러남.
        // 단위체크를 통해 long 으로 바꾸어서 해결.
        long cnt = 0;
        int firstPrice = price;
        long total = 0;

        while (cnt < count) {
            cnt++;
            price = (int) (firstPrice * cnt);
            System.out.println("price = " + price);
            total += price;
            System.out.println("total = " + total);
            System.out.println("cnt = " + cnt);
        }

        if (total > money) {
            answer = total - money;
        }
        // 보유한 금액이 모자라지 않으면 => 보유한 금액 >= total 체크.
        if (money >= total) {
            answer = 0;
        }
        System.out.println("answer = " + answer);

        return answer;
    }
}

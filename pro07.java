import java.util.ArrayList;
class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i : numbers) {
			list.remove(Integer.valueOf(i));
		}
		for(int i : list) {
			answer += i;
		}
		return answer;
	}
}
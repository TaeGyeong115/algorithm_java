import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int[] i : intervals) {
            for(int j = i[0]; j <= i[1]; j++) {
                list.add(arr[j]);
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

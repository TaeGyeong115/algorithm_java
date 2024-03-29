package practice_exercise.an_array_of_numbers_divisible_by;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() > 0) {
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
package _00_coding_basics_training.day17.remove_ad;

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();

        for(String str : strArr) {
            if(!str.contains("ad")) list.add(str);
        }

        answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

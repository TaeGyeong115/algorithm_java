package _00_coding_basics_training.day14.to_do_list;

import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();

        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                list.add(todo_list[i]);
            }
        }

        answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

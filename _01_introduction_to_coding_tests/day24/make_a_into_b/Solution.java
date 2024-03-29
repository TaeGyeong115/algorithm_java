package _01_introduction_to_coding_tests.day24.make_a_into_b;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;

        for(char ch : before.toCharArray()) {
            int a = (int)before.chars().filter(c -> c == ch).count();
            int b = (int)after.chars().filter(c -> c == ch).count();
            if (a != b) return 0;
        }

        return answer;
    }
}

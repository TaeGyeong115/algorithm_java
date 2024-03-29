package _01_introduction_to_coding_tests.day11.factorial;

class Solution {
    public int solution(int n) {
        int answer = 10;
        int sum = 1;

        for(int i = 1; i <= 10; i++) {
            sum *= i;
            if(sum > n) return i - 1;
        }

        return answer;
    }
}

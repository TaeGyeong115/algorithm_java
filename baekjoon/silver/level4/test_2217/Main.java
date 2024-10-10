package silver.level4.test_2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] rope = new int[n];

        for (int i = 0; i < n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        Arrays.sort(rope);
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, rope[i] * (n - i));
        }

        System.out.print(answer);
    }
}
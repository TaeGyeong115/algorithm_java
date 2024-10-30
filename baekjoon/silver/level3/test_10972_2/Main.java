package silver.level3.test_10972_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = 0;
        int end = 0;

        for (int i = N - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                start = i;
                break;
            }
        }
        if (start == 0) {
            System.out.println(-1);
            return;
        }

        for (int i = N - 1; i >= start; i--) {
            if (arr[i] > arr[start - 1]) {
                end = i;
                break;
            }
        }

        int temp = arr[start - 1];
        arr[start - 1] = arr[end];
        arr[end] = temp;

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < start; i++) {
            answer.append(arr[i]).append(" ");
        }

        for (int i = N - 1; i >= start; i--) {
            answer.append(arr[i]).append(" ");
        }

        System.out.println(answer.toString().trim());
    }
}
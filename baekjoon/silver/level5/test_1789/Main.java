package silver.level5.test_1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long sum = 1;
        long i = 1;
        while (sum <= n) {
            sum += ++i;
        }

        System.out.print(i - 1);
    }
}

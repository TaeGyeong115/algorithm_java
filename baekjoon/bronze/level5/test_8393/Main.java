package bronze.level5.test_8393;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= input; i++) {
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.close();
    }
}

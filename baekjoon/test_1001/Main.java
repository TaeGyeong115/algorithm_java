package baekjoon.test_1001;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        bw.write(String.valueOf(Integer.parseInt(input[0]) - Integer.valueOf(input[1])));
        bw.close();
    }
}

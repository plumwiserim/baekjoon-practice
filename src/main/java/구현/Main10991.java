package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10991 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i < j; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

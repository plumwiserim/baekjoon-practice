import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최소공배수
public class Main1934 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            String[] input_numbers = br.readLine().split(" ");
            int A = Integer.parseInt(input_numbers[0]);
            int B = Integer.parseInt(input_numbers[1]);
            int j;
            for (j = A; j > 0; j--) {
                if (A % j == 0 && B % j == 0) {
                    break;
                }
            }
            System.out.println(A * B / j);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

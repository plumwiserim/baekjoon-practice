import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//별찍기2
public class Main2439 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

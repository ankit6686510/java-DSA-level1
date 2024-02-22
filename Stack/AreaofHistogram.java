package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class AreaofHistogram {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        int[] rb = new int[arr.length];
        int[] lb = new int[arr.length];

    }
}

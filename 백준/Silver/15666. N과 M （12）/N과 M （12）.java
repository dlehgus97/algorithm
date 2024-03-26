import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[] arr;
    public static int[] answer;
    public static boolean[] check;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        answer = new int[M];
        check = new boolean[N];
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0, 0);
        System.out.println(sb);

    }

    public static void dfs(int depth, int start) {
        if (depth == M) {
            for (int a : answer) {
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }

        int prev = 0;
        for (int i = start; i < arr.length; i++) {
            if (!check[i] && prev != arr[i]) {
                answer[depth] = arr[i];
                dfs(depth + 1, i);
                prev = arr[i];
            }
        }
    }
}
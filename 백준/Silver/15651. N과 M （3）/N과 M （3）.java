import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static boolean [] check;
    static int [] arr;
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        check = new boolean[N+1];

        dfs(0);

        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth == M){
            for(int num : arr){
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1 ; i<=N; i++){
                check[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                check[i] = false;
        }
    }
}
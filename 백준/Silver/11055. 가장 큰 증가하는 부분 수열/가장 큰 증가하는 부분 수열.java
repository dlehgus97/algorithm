import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[N];
        int [] dp = new int[N];

        for(int i = 0 ; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            dp[i] = num;
        }

        int result = dp[0];

        for(int i = 1; i<N; i++){
            for(int j = 0 ; j<i; j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j] + arr[i]);
                }
            }
            result = Math.max(result,dp[i]);
        }
        System.out.println(result);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1 ;
        int num = 10;
        int result = 0 ;

        for(int i = 1 ; i<=N; i++){
            if(i %num == 0){
                num *= 10;
                count ++;
            }
            result +=count;
        }
        System.out.println(result);
    }
}
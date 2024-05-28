import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        for(int i = 0 ; i<4; i++){
            total += Integer.parseInt(br.readLine());
        }
        
        System.out.println(total/60);
        System.out.println(total%60);
    }
}
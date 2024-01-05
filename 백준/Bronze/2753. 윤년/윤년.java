import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N % 4 == 0 && N % 100 != 0){
            System.out.println(1);
        }
        else if(N % 100 == 0 && N % 400 != 0){
            System.out.println(0);
        }
        else if(N % 400 == 0){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] arr = new int[9][9];

        int max = -1;
        int row = 0;
        int col = 0;

        for(int i = 0 ; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(row + " " + col);
    }
}


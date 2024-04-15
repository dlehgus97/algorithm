import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(binarySearch(n));
    }

    static long binarySearch(long n){
        long start = 0;
        long end = n;
        long result = 0;

        while(start <= end) {
            long mid = (start + end) / 2;
            if(n <= Math.pow(mid, 2)){
                result = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return result;
    }
}

/* 이분탐색사용 안하고 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long sqrt_N = (long) Math.sqrt(n);

        if (sqrt_N * sqrt_N <n) {
            sqrt_N ++;
        }
        System.out.println(sqrt_N);
        
    }
}*/

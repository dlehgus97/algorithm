import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i = 0 ; i<answer.length; i++){
            String str = "";
            for(int j =my_string.length() - 1 - i ; j<=my_string.length() - 1; j++){
                str += my_string.charAt(j); 
            }
            answer[i] = str;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
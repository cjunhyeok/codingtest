package programmers.lv2;

import java.util.*;

public class NLeastCommonMultiple {
    public int solution(int[] arr) {
        int answer = 0;
        int big = arr[arr.length-1];
        int index = arr.length-1;
        Arrays.sort(arr);

        while(true)
        {
            boolean check = true;
            for(int i = 0; i < index; i++)
            {
                if(big%arr[i]!=0)
                {
                    check = false;
                }
            }

            if(check==true)
            {
                answer = big;
                break;
            }
            big = big+arr[arr.length-1];
        }
        return answer;
    }
}

package Lv1.가장_가까운_같은_글자;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static int[] solution(String s) {

        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {

            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
            } else {
                int index = map.get(s.charAt(i));
                answer[i] = i-index;
            }

            map.put(s.charAt(i), i);
        }

        return answer;
    }


    public static void main(String[] args) {
        String s1 = "banana";  // 예시 입력 1
        int[] result1 = solution(s1);
        System.out.print("result : ");
        for (int r : result1) {
            System.out.print(r + " ");  // [-1, -1, -1, 2, 2, 2]
        }

        System.out.println("");

        String s2 = "foobar";  // 예시 입력 2
        int[] result2 = solution(s2);
        System.out.print("result : ");
        for (int r : result2) {
            System.out.print(r + " "); // [-1, -1, 1, -1, -1, -1]
        }
    }
}

package Lv1.대충_만든_자판;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static int[] solution(String[] keymap, String[] targets) {

        Map<String, Integer> indexMap1 = new HashMap<>();
        Map<String, Integer> indexMap2 = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            char[] t = keymap[i].toCharArray();
            Map<String, Integer> currentMap = (i == 0) ? indexMap1 : indexMap2;

            int index = 0;
            for (char c : t) {
                currentMap.putIfAbsent(String.valueOf(c), index++);
            }
        }


        int[] answer = {};
        return answer;
    }



    public static void main(String[] args) {
        // 예제 1
        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD", "AABB"};
        printResult(solution(keymap1, targets1));  // 출력: 9, 4

//        // 예제 2
//        String[] keymap2 = {"AA"};
//        String[] targets2 = {"B"};
//        printResult(solution(keymap2, targets2));  // 출력: -1
//
//        // 예제 3
//        String[] keymap3 = {"AGZ", "BSSS"};
//        String[] targets3 = {"ASA", "BGZ"};
//        printResult(solution(keymap3, targets3));  // 출력: 4, 6
    }

    // 결과 출력 함수
    private static void printResult(int[] result) {
        for (int time : result) {
            System.out.println(time);
        }
    }
}

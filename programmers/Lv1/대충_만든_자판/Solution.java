package Lv1.대충_만든_자판;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> indexMap = new HashMap<>();

        // keymap에서 각 문자에 대한 최소값을 저장
        for(String key : keymap) {
            for(int i=0; i<key.length(); i++) {
                char c = key.charAt(i);
                indexMap.put(c, Math.min(indexMap.getOrDefault(c, i + 1), i + 1));
            }
        }

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (char c : targets[i].toCharArray()) {

                // 문자가 keymap에 없을 경우 -1 반환
                if (!indexMap.containsKey(c)) {
                    answer[i] = -1;
                    count = -1;
                    break;
                }
                count += indexMap.get(c);
            }

            if (count != -1) {
                answer[i] = count;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        // 예제 1
        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD", "AABB"};
        printResult(solution(keymap1, targets1));  // 출력: 9, 4

        // 예제 2
        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};
        printResult(solution(keymap2, targets2));  // 출력: -1

        // 예제 3
        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA", "BGZ"};
        printResult(solution(keymap3, targets3));  // 출력: 4, 6
    }

    // 결과 출력 함수
    private static void printResult(int[] result) {
        for (int time : result) {
            System.out.println(time);
        }
    }
}

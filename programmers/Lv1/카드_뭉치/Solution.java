package Lv1.카드_뭉치;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;

        for(String str : goal) {
            if(index1 < cards1.length && str.equals(cards1[index1])) {
                index1++;
            }
            else if(index2 < cards2.length && str.equals(cards2[index2])) {
                index2++;
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }


    public static void main(String[] args) {
        // 첫 번째 테스트 케이스
        String[] cards1_1 = {"i", "drink", "water"};
        String[] cards1_2 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};
        String result1 = solution(cards1_1, cards1_2, goal1);
        System.out.println("result : " + result1); // "Yes"


        // 두 번째 테스트 케이스
        String[] cards2_1 = {"i", "water", "drink"};
        String[] cards2_2 = {"want", "to"};
        String[] goal2 = {"i", "want", "to", "drink", "water"};
        String result2 = solution(cards2_1, cards2_2, goal2);
        System.out.println("result: " + result2); // "No"
    }


}

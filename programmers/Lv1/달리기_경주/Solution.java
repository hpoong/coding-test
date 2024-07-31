package Lv1.달리기_경주;

import java.util.*;

public class Solution {


    public static String[] solution(String[] players, String[] callings) {

        // 순서
        Map<String, Integer> indexMap = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            indexMap.put(players[i], i);
        }

        for(String str: callings) {
            int index = indexMap.get(str);

            if(index > 0) {
                // 앞서 갔던 친구
                String frontPlayer = players[index-1];
                players[index-1] = players[index];
                players[index] = frontPlayer;

                indexMap.put(players[index-1], index-1);
                indexMap.put(players[index], index);
            }
        }


        return players;
    }



    public static void main(String[] args) {
        // 예시 1
        String[] players1 = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings1 = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players1, callings1)));  // [mumu, kai, mine, soe, poe]

        // 예시 2
        String[] players2 = {"alice", "bob", "charlie", "david"};
        String[] callings2 = {"david", "charlie", "bob"};
        System.out.println(Arrays.toString(solution(players2, callings2)));  // [bob, alice, charlie, david]

        // 예시 3
        String[] players3 = {"jane", "john", "doe", "smith"};
        String[] callings3 = {"doe", "smith", "john", "doe"};
        System.out.println(Arrays.toString(solution(players3, callings3)));  // [doe, jane, john, smith]
    }
}

package lv1.달리기_경주;

import java.util.*;

public class Solution_01 {


    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> positionMap = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            positionMap.put(players[i], i);
        }

        List<String> currentOrder = new ArrayList<>(Arrays.asList(players));

        for (String calling : callings) {
            int currentIndex = positionMap.get(calling);
            if (currentIndex > 0) {
                String frontPlayer = currentOrder.get(currentIndex - 1);
                currentOrder.set(currentIndex - 1, calling);
                currentOrder.set(currentIndex, frontPlayer);

                positionMap.put(calling, currentIndex - 1);
                positionMap.put(frontPlayer, currentIndex);
            }
        }


        String[] answer = currentOrder.toArray(new String[0]);
        return answer;
    }



    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        Solution_01 solution01 = new Solution_01();
        solution01.solution(players, callings);
    }
}

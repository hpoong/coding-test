package 완주하지_못한_선수;

import java.util.HashMap;

public class Solution_02 {

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String part : participant ) map.put(part, 1);
        for(String comp : completion )  map.put(comp, 0);
        for(String key : map.keySet()) if(map.get(key) == 0)  return key;
        return null;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }
}

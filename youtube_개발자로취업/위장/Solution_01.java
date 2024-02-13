package 위장;

import java.util.HashMap;
import java.util.Iterator;

public class Solution_01 {

    public int solution(String[][] clothes) {

        // 옷을 종류별로 구분한다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] type: clothes) {
            map.put(type[1], map.getOrDefault(type[1], 1) + 1);
        }

        int answer = 1;

        // 입지 않는 경우를 추가해서 모든 조합을 계산한다.
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext())
            answer *= map.get(it.next());

        // 아무종류의 옷도 입지 않는 경우 제외한다.
        return answer - 1;
    }
    public static void main(String[] args) {

        String[][] clothes = {
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };
        Solution_01 solution01 = new Solution_01();
        System.out.println(solution01.solution(clothes));
    }
}

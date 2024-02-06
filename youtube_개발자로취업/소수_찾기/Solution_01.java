package 소수_찾기;

import java.util.HashSet;

public class Solution_01 {

    HashSet<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {

        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);
        System.out.println(numberSet);


        // 2. 소수의 개수만  센다
        // 3. 소수의 개수를 반환한다.
        int answer = 0;
        return answer;
    }

    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if(!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));

        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for(int i=0; i<others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }


    public static void main(String[] args) {
        Solution_01 solution01 = new Solution_01();
        System.out.println(solution01.solution("5157"));
    }
}

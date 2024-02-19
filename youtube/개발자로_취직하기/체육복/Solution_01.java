package 개발자로_취직하기.체육복;

import java.util.HashSet;

public class Solution_01 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // Set을 만든다.
        HashSet<Integer> resSet = new HashSet<>();  // 여분
        HashSet<Integer> lostSet = new HashSet<>(); // 도둑

        for(int i : reserve)
            resSet.add(i);

        for(int i: lost) {

            // 여분이 있다가 도둑 맞음
            if(resSet.contains(i)) {
                resSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        // 여분을 기준으로 앞뒤로 확인하여 체육복을 빌려준다.
        for(int i: resSet) {
            if(lostSet.contains(i-1))
                lostSet.remove(i-1);
            else if(lostSet.contains(i+1))
                lostSet.remove(i+1);
        }

        // 전체 학생 수에서 lostSet에 남은 학생수를 빼준다.
        return n - lostSet.size();
    }



    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        Solution_01 solution01 = new Solution_01();
        System.out.println(solution01.solution(5, lost, reserve));
    }


}

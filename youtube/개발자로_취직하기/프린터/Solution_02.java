package 개발자로_취직하기.프린터;

import java.util.ArrayList;
import java.util.List;

public class Solution_02 {

    public int solution(int[] priorities, int location) {

        List<Integer> printer = new ArrayList<>();
        // Queue를 만들기
        for(int i=0; i<priorities.length; i++) {
            printer.add(priorities[i]);
        }

        int answer = 0;
        // 0번을 꺼내서 max priority 가 아니면 다시 끝에 넣는다.
        while (!printer.isEmpty()) {
            Integer priority = printer.remove(0);
            if(printer.stream().anyMatch(val -> val > priority)) {
                printer.add(priority);
            } else {
                // max priority 이면 내가 찾는 job이 맞는지 확인한다.
                answer++;
                if(location == 0)
                    break;
            }

            location--;
            if(location < 0)
                location = printer.size() -1;
        }


        return answer;
    }



    public static void main(String[] args) {
        Solution_02 solution01  = new Solution_02();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution01.solution(priorities, location));
    }


}

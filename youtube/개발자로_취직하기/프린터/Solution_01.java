package 개발자로_취직하기.프린터;

import java.util.ArrayList;
import java.util.List;

public class Solution_01 {

    public int solution(int[] priorities, int location) {

        // Queue를 만들기
        List<PrintJob> list = new ArrayList<>();
        for(int i=0; i<priorities.length; i++) {
            list.add(new PrintJob(i, priorities[i]));
        }

        int answer = 0;
        while (!list.isEmpty()) {

            // 0번을 꺼내서 max priority 가 아니면 다시 끝에 넣는다.
            PrintJob job = list.remove(0);
            if(list.stream().anyMatch(val -> val.priority > job.priority)) {
                list.add(job);
            } else {
                // max priority 이면 내가 찾는 job이 맞는지 확인한다.
                answer++;
                if(location == job.location)
                    break;
            }
        }

        return answer;
    }
    class PrintJob {
        int priority;
        int location;

        public PrintJob(int location, int priority) {
            this.priority = priority;
            this.location = location;
        }
    }


    public static void main(String[] args) {
        Solution_01 solution01  = new Solution_01();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution01.solution(priorities, location));
    }


}

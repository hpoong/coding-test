package 완주하지_못한_선수;

import java.util.Arrays;

public class Solution_01 {

    public static String solution(String[] participant, String[] completion) {

        // 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);


        // 두 배열이 다를 때까지 찾는다.
        int i=0;
        for(; i<completion.length; i++) {
            if(!participant[i].equals(completion[i]))
                break;
        }

        // for문을 break없이 왔다면 마지막 주자는 완주하지 못한 선수.
        return participant[i];
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }
}

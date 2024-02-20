package 개발자로_취직하기.메뉴_리뉴얼;

import java.util.Arrays;

public class Solution_01 {

    List<String> anws

    public String[] solution(String[] orders, int[] course) {

        // 각 order 정렬
        for(int i=0; i<orders.length; i++) {
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = String.valueOf(chars);
        }

        // 각 order기준으로 course leng 만큼의 조합 만들기
        for(int courseLeng: course) {
            for(String order: orders) {
                combination("", order, courseLeng);
            }
        }

        // 가장 많은 조합을 answer에 저장한다.


        String[] answer = {};
        return answer;
    }

    private void combination(String str, String order, int courseLeng) {

    }


    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        Solution_01 solution01 = new Solution_01();
        System.out.println(solution01.solution(orders, course));
    }
}

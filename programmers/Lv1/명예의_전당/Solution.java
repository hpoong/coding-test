package Lv1.명예의_전당;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static int[] solution(int k, int[] score) {

        List<Integer> sortList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i=0; i<score.length; i++) {
            sortList.add(score[i]);
            Collections.sort(sortList, Collections.reverseOrder());

            if(i < k) {
                int data = sortList.get(sortList.size()-1);
                resultList.add(data);
            }

            else {
                int data = sortList.get(k-1);
                resultList.add(data);
            }
        }

        int[] answer = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }



    public static void main(String[] args) {
        // 첫 번째 예시
        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] result1 = solution(k1, score1);
        System.out.print("result: "); // [10, 10, 10, 20, 20, 100, 100]
        for (int r : result1) {
            System.out.print(r + " ");
        }
        System.out.println();

        // 두 번째 예시
        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result2 = solution(k2, score2);
        System.out.print("result: "); // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
        for (int r : result2) {
            System.out.print(r + " ");
        }
        System.out.println();
    }


}

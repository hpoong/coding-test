package Lv1.둘만의_암호;

public class Solution {

    public static String solution(String s, String skip, int index) {
        String ap = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < skip.length(); i++) {
            String str = String.valueOf(skip.charAt(i));
            ap = ap.replace(str, "");
        }

        String result = "";

        // 각 문자를 순회
        for(int i = 0; i < s.length(); i++) {
            int p = ap.indexOf(s.charAt(i));
            int newIndex = (p + index) % ap.length();
            result += ap.charAt(newIndex);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // 첫 번째 테스트 케이스
        String s1 = "aukks";
        String skip1 = "wbqd";
        int index1 = 5;

        // 두 번째 테스트 케이스
        String s2 = "xyz";
        String skip2 = "ab";
        int index2 = 3;

        // 첫 번째 테스트 케이스 실행
        String result1 = solution(s1, skip1, index1);
        System.out.println("첫 번째 테스트 결과: " + result1); // 예상 출력: "happy"

        // 두 번째 테스트 케이스 실행
        String result2 = solution(s2, skip2, index2);
        System.out.println("두 번째 테스트 결과: " + result2); // 예상 출력: "abc" (가정한 결과값)
    }


}

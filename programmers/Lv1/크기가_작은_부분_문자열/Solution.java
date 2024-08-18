package Lv1.크기가_작은_부분_문자열;

public class Solution {



    // TODO: 부분 문자열은 문자들이 원래 순서를 유지한 채로 연속된 부분을 의미
    public static int solution(String t, String p) {
        int pLeng = p.length();
        Long value = Long.parseLong(p);
        int count = 0;

        for(int i=0; i<=(t.length() - pLeng); i++) {
            String str = t.substring(i, i + pLeng);
            Long compValue = Long.parseLong(str);
            if(value >= compValue) count++;
        }

        return count;
    }


    public static void main(String[] args) {
        String t1 = "3141592";
        String p1 = "271";
        int result1 = solution(t1, p1);
        System.out.println("result : " + result1);  // 2

        String t2 = "500220839878";
        String p2 = "7";
        int result2 = solution(t2, p2);
        System.out.println("result : " + result2);  // 8

        String t3 = "10203";
        String p3 = "15";
        int result3 = solution(t3, p3);
        System.out.println("result : " + result3);  // 3
    }


}

package Lv1.덧칠하기;

public class Solution {


    public static int solution(int n, int m, int[] section) {
        int result = 0;
        int currentIndex = 1;
        
        
        for(int i=0; i<section.length; i++) {
            if(currentIndex <= section[i]) {
                currentIndex = section[i] + m;
                result++;
            }
        }

        return result;
    }



    public static void main(String[] args) {

        // 예제 1
        int n1 = 8;
        int m1 = 4;
        int[] section1 = {2, 3, 6};
        int result1 = solution(n1, m1, section1);
        System.out.println("예제 1의 결과: " + result1); // 출력: 2

        // 예제 2
        int n2 = 5;
        int m2 = 4;
        int[] section2 = {1, 3};
        int result2 = solution(n2, m2, section2);
        System.out.println("예제 2의 결과: " + result2); // 출력: 1

        // 예제 3
        int n3 = 4;
        int m3 = 1;
        int[] section3 = {1, 2, 3, 4};
        int result3 = solution(n3, m3, section3);
        System.out.println("예제 3의 결과: " + result3); // 출력: 4
    }
}

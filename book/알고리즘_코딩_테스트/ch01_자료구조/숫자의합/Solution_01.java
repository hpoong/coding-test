package 알고리즘_코딩_테스트.ch01_자료구조.숫자의합;

import java.util.Scanner;

public class Solution_01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();

        int sum = 0;
        char[] cNum = sNum.toCharArray();
        for(int i=0; i<cNum.length; i++) {
            int value = cNum[i] - '0'; // Char to Int
            sum += value;
        }

        System.out.println(sum);
    }
}

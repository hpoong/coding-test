package 알고리즘_코딩_테스트.ch01_자료구조.평균구하기;

import java.util.Scanner;

public class Solution_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];

        long sum = 0;
        long max = 0;

        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
            if(max < a[i]) max = a[i];
            sum += a[i];
        }

        System.out.println(sum * 100.0 / max / a.length ); // double 변환
    }

}

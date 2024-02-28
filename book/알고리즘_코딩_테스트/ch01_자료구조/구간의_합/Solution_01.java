package 알고리즘_코딩_테스트.ch01_자료구조.구간의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_01 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(bf.readLine());

        int suNo = Integer.valueOf(tokenizer.nextToken());      // 숫자 개수
        int quizNo = Integer.valueOf(tokenizer.nextToken());    // 질의 개수

        long[] s = new long[suNo + 1];

        tokenizer = new StringTokenizer(bf.readLine());

        for(int i=1; i<suNo+1; i++) {
            s[i] = s[i-1] + Integer.valueOf(tokenizer.nextToken());
        }

        for(int q = 0; q <quizNo; q++) {
            tokenizer = new StringTokenizer(bf.readLine());
            int i = Integer.valueOf(tokenizer.nextToken());
            int j = Integer.valueOf(tokenizer.nextToken());

            System.out.println(s[j] - s[i-1]);
        }
    }
}

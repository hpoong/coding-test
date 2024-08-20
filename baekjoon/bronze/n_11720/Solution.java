package bronze.n_11720;

import java.util.Scanner;

public class Solution {


    public static void solution() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String count = in.next();
        String value = in.next();
        for(int i=0; i<value.length(); i++) {
            sum += value.charAt(i) - '0';
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        solution();
    }
}

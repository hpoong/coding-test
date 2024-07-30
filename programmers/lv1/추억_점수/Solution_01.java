package lv1.추억_점수;

import java.util.*;

public class Solution_01 {


    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        Map<String, Integer> pointMap = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            pointMap.put(name[i], yearning[i]);
        }

        return Arrays.stream(photos)
                .mapToInt(
                     photo -> Arrays.stream(photo).mapToInt(person -> pointMap.getOrDefault(person, 0)).sum()
                ).toArray();
    }


    public static void main(String[] args) {
        Solution_01 solution01 = new Solution_01();

        // 입출력 예시 1
        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        int[] result1 = solution01.solution(name1, yearning1, photo1);
        System.out.print("Result 1: ");
        for (int val : result1) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 입출력 예시 2
        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {
                {"kali", "mari", "don"},
                {"pony", "tom", "teddy"},
                {"con", "mona", "don"}
        };
        int[] result2 = solution01.solution(name2, yearning2, photo2);
        System.out.print("Result 2: ");
        for (int val : result2) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 입출력 예시 3
        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {
                {"may"},
                {"kein", "deny", "may"},
                {"kon", "coni"}
        };
        int[] result3 = solution01.solution(name3, yearning3, photo3);
        System.out.print("Result 3: ");
        for (int val : result3) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

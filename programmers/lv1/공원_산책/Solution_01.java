package lv1.공원_산책;

import java.util.Arrays;

public class Solution_01 {


    public static int[] solution(String[] park, String[] routes) {

        int height = park.length;
        int width = park[0].length();
        int[] currentPosition = new int[2];


        // 시작 지점 찾기
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                // [0, 0], [0, 1], [0, 2]
                if (park[i].charAt(j) == 'S') {
                    currentPosition[0] = i;
                    currentPosition[1] = j;
                    break;
                }
            }
        }


        System.out.print("S 위치 : ");
        for (int val : currentPosition) {
            System.out.print(val + " ");
        }


        // 명령어 실행
        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0]; // 위치
            int distance = Integer.parseInt(parts[1]); // 이동방향

            int nextY = currentPosition[0];
            int nextX = currentPosition[1];
            boolean validMove = true;

            // 명령어에 따른 이동
            for (int step = 1; step <= distance; step++) {
                switch (direction) {
                    case "N":
                        nextY--;
                        break;
                    case "S":
                        nextY++;
                        break;
                    case "W":
                        nextX--;
                        break;
                    case "E":
                        nextX++;
                        break;
                }

                // 경로 유효성 체크
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width || park[nextY].charAt(nextX) == 'X') {
                    validMove = false;
                    break;
                }

                // 4. 위치 업데이트
                if (validMove) {
                    currentPosition[0] = nextY;
                    currentPosition[1] = nextX;
                }
            }



        }
        // 5. 최종 위치 반환
        return currentPosition;
    }



    public static void main(String[] args) {

        String[] park1 = {"SOO", "OOO", "OOO"};
        String[] routes1 = {"E 2", "S 2", "W 1"};
        int[] result1 = solution(park1, routes1);
        System.out.println(Arrays.toString(result1)); // [2, 1]
        System.out.println();

        String[] park2 = {"SOO", "OXX", "OOO"};
        String[] routes2 = {"E 2", "S 2", "W 1"};
        int[] result2 = solution(park2, routes2);
        System.out.println(Arrays.toString(result2)); // [0, 1]
        System.out.println();

        String[] park3 = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes3 = {"E 2", "S 3", "W 1"};
        int[] result3 = solution(park3, routes3);
        System.out.println(Arrays.toString(result3)); // [0, 0]
        System.out.println();
    }
}

package Lv2.전화번호_목록;

import java.util.Arrays;

public class Solution_02 {

    public static boolean solution(String[] phone_book) {
       // phone_book 정렬한다.
        Arrays.sort(phone_book);

        // 1중 loop를 돌면서 앞번호의 접두어인지 확인
        for(int i=0; i<phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }

        // 여기까지 오지 못했다면 접두어가 없다는것.
        return true;
    }

    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
        String[] phone_book = {"12","123","1235","567","88"};
        System.out.println(!solution(phone_book));
    }
}

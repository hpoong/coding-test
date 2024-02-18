package 개발자로_취직하기.전화번호_목록;

import java.util.Arrays;

public class Solution_01 {

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length; i++) {
            if(i+1 == phone_book.length) break; // TODO: 여기 개선사항
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
        String[] phone_book = {"12","123","1235","567","88"};
        System.out.println(!solution(phone_book));
    }
}

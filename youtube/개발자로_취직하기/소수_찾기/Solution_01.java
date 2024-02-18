package 개발자로_취직하기.소수_찾기;

import java.util.HashSet;
import java.util.Iterator;

public class Solution_01 {

    HashSet<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {

        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);
        System.out.println(numberSet);

        int count = 0;

        // 2. 소수의 개수만  센다
        Iterator<Integer> it = numberSet.iterator();

        while (it.hasNext()) { // hasNext
            int num = it.next();
            if(isPrime(num))
                count ++;
        }


        // 3. 소수의 개수를 반환한다.
        return count;
    }

    public boolean isPrime(int num) {
        // 0과 1인 소수가 아니다.
        if(num == 0 || num == 1)
            return false;

        // 에라토스테네스의 체의 limit 계산한다.
        int lim = (int)Math.sqrt(num);

        // 에라토스테네스의 페에 따라 limit 까지만 배수 여부를 확인
        for(int i=2; i<=lim; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }

    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if(!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));

        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for(int i=0; i<others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }


    public static void main(String[] args) {
        Solution_01 solution01 = new Solution_01();
        System.out.println(solution01.solution("17"));
    }
}

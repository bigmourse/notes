package note1_10;

import java.util.HashMap;

/**
 * 盒子中小球的最大数量
 */
public class MaximumNumberOfBallsInTheBoox {


    public static void main (String[] args) {
        int lowLimit = 5;
        int highLimit = 15;
        System.out.println(countBalls(lowLimit,highLimit));

    }

    public static int countBalls (int lowLimit, int highLimit) {
        int result = 1;
        int a = 0;
        int b = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for ( int i = lowLimit; i<=highLimit; i++) {
//          计算每一个数的位数和, 并比较
            a = count(i);
            if (hashMap.containsKey(a)) {
                b = hashMap.get(a) + 1;
                hashMap.put(a, b);
                result = Math.max(result, b);
            } else {
                hashMap.put(a, 1);
                result = Math.max(result, 1);
            }
        }
        return result;
    }

    public static int count (int number) {
        if (number < 10) {
            return number;
        }
        int cnt = 0;
        while ( number >= 10 ) {
            cnt = cnt + number % 10;
            number = number / 10;
        }
        return cnt + number;
    }
}



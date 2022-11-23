package note1_10;

/**
 * 拼车
 * capacity 个空座位
 * trip[i] = [numPassengersi, fromi, toi] 
 * 表示第 i 次旅行有 numPassengersi 乘客，
 * 接他们和放他们的位置分别是 fromi 和 toi
 *
 * 理解 每个站点的人和差分数组之间的关系
 */
public class Carpoool {

    public static void main(String[] args) {
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        System.out.println(carPooling(trips, capacity));

    }

    public static boolean carPooling(int[][] trips, int capacity) {
//        第一步：计算每个站  的 差分人数（第i个站上x人 ，第i个站下y人）
        int[] numPersons = new int[1001];
        for (int[] trip : trips) {
            int numPerson = trip[0];
            int from = trip[1];
            int to = trip[2];
            numPersons[from] =  numPersons[from] + numPerson;
            numPersons[to] =  numPersons[to] - numPerson;
        }
//        第二步：计算每个站的人数
        int num = 0;
        for (int i = 0; i <= 1000; i++) {
            num = num + numPersons[i];
            if (num > capacity) {
                return false;
            }
        }
        return true;
    }
}

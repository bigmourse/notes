package test001;


import java.util.*;

/**
 * 矩阵的最短路径和：从左上到右下
 *1：特殊情况，第一行和第一列的最小值
 *2：找出到（i，j）的最短min，分别从左和从上过来的
 *
 *  1   3  1
 *  1   5  1
 *  4   2  2
 *  输入：grid = [[1,3,1],[1,5,1],[4,2,2]]
 * 输出：8
 * 请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
 */
public class T005 {
    public static void main(String[] args) {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        int m=grid.length;
        int n=grid[0].length;
        int minResult=0;
        minResult=T005.solve(grid,m-1,n-1);
        System.out.println(minResult);
    }
    static int solve(int[][] arr,int m,int n){
        if(m<0 || n<0){return Integer.MAX_VALUE;}//边界条件
        if(m==0&&n==0)return arr[0][0];

        int min=Math.min(solve(arr,m-1,n),solve(arr,m,n-1));
        int result=min+arr[m][n];
        return result;
    }


}

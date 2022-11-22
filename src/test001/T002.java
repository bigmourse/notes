package test001;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 冒泡排序
 * 思想：
 * 每一次循环都把最大的数往后面放
 */

public class T002 {

    public static void main(String[] args) {

        int[] arr={2,3,1,1,6,8,9,23,32};
        sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }

    public static void sort(int[] arr){
        int i,j,temp;
        int length=arr.length;
//        第一层表示需要冒泡循环多少次
        for(i=0;i<length-1;i++){
//            实际第二层的循环是冒泡排序的方法
            for(j=0;j<=length-1-(i+1);j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}

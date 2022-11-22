package test001;


import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.Scanner;

/**
 * 快排
 * 先从右往左找到一个小于基准数的数，
 * 再从左往右找到一个大于基准数的数，交换他们.重复，
 * 当ij相遇时把此时这个数和基准数交换，再分别处理左右两边的数字
 */
public class T001 {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,6,46,9,8,23,32,21,34,12,256,47,11,6,9,64};
        int arrLength=arr.length-1;
        if(arrLength!=0) quickSort(arr,0,arrLength);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
//快排中要明白为什么，递归时候索引的变化——递归为什么索引没有取中间那个值
    public static void quickSort(int[] arr,int start,int end){
        while(start>=end)return;
        int temp=arr[start];//基数\
        int i=start,j=end;
        //1找比基数大的和基数小的，大的放右边，小的放左边，大的从左往右找，小的从右往左找，找到两个就调换
        while(i<j){
//            2内部还要加入ij之间比较，防止过度遍历，索引出错
//            4跳出第一层while循环地方在第二层while循环的第一个while中，结束时应该是i=j
            while(arr[i]<=temp && i<j){//找出比temp大的
                i++;
            }
            while(arr[j]>=temp && i<j){//找出比temp小的
                j--;
            }
//            3这里还是要比较ij，注意这是因为进入第一层while后，里面有第二层while循环可以改变ij的值
            if(i<j){
                int temp2=arr[i];
                arr[i]=arr[j];
                arr[j]=temp2;
            }
        }
//        5跳出上面while循环的条件必定是索引i和j刚好相等
        if(i==j) {
//  重要难点：此处的条件判断只是为了区分：在与temp对比时是否找到最大值对应索引，
            if(arr[i]<temp){
                arr[start]=arr[i];
                arr[i]=temp;
//                for (int num : arr) { System.out.print(num+" "); }System.out.println();
                quickSort(arr,start,i-1);
            }else{
                arr[start] = arr[j-1];
                arr[j-1] = temp;
//                for (int num : arr) { System.out.print(num+" "); }System.out.println();
                quickSort(arr,start,j-2);
                quickSort(arr,j,end);
            }

        }


    }


}

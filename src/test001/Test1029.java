package test001;

import java.util.ArrayList;
import java.util.*;

public class Test1029 {

    public static void main(String[] args) {
        int[] arrint={2,4,7,2,5,43,85,34,2,5,9,6,34,21,11,12};
        ArrayList<ArrayList<Integer>> list=new Solution().combinationSum2(arrint,23);
        for(ArrayList<Integer> a:list){
            for(Integer i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(num == null || num.length==0 || target<0)return res;
        Arrays.sort(num);
        dfs(num,target,res,arr,0);
        return res;
    }
    void dfs(int[] num,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> arr,int start){
        if(target==0){
            res.add(new ArrayList<Integer>(arr));
            return;
        }
        if(start >= num.length)return;
        for(int i=start;i<num.length;i++){
            if(i > start && num[i] == num[i-1])continue;
            if(num[i] <= target){
                arr.add(num[i]);
                dfs(num,target-num[i],res,arr,i+1);
                arr.remove(arr.size()-1);
            }
        }
        return;
    }
}



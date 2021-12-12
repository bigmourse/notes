package test001;




public class Tes {
    public static void main(String[] args) {
        int[][] arr={{1,3,16},{10,11,-1},{1,14,14}};
//        for(int[] i:arr){
//            for(int j:i){
//                System.out.println(j);
//            }
//        }
           int result= new Solution1().away(arr);
int a=(int)Math.pow(2,3);
int[] arr2={5,4,9,7,8,3,1,5};
        System.out.println(a);
        System.out.println(result);
    }

}
class Solution1 {
    int min=Integer.MAX_VALUE;

    public int away(int[][] arr){
        s(arr,arr.length-1,arr[0].length-1,0);
        return min;
    }

    public void s(int[][] arr,int i,int j,int and){
        and+=arr[i][j];
        if(i==0&&j==0){
            if(and<min)min=and;
            return;
        }
        if(i-1<arr.length&&i-1>=0&&j<arr[0].length&&j>=0&&arr[i-1][j]!=-1){
            s(arr,i-1,j,and);
        }
        if(i>=0&&i<arr.length&&j-1>=0&&j-1<arr[0].length&&arr[i][j-1]!=-1){
            s(arr,i,j-1,and);
        }

        return;

    }


}

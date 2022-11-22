package test001;

/**
 * 插入排序
 * 从头开始，把已经排序好与一个新数据进行比较
 */
public class T003 {
    public static void main(String[] args) {
        int[] arr={1,9,5,2,8,3,7,4,5,3,9};
        int arrLength=arr.length;
        insertSort(arr,arrLength-1);
        for (int num : arr ) {
            System.out.print(num+" ");
        }

    }

    public static void insertSort(int[] arr,int arrlength){
//        第一层循环表示需要和有序数据进行比较的数
        for(int i=1;i<=arrlength;i++){
//            第二层循环，遍历有序数组与需要比较的数据进行比较
//            记住一点，有序数组是从小到大已经排列好的
            int temp=arr[i];//这里是为了保证大数往前移时，比较的数据丢失
            for(int j=i-1;j>=0;j--){
//                if解释：为了置换到不比temp大的前一个位置
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }else{
//                  如果大的数都比temp小，后面更小的数就不需要进行比较了
//                   那么当大的数都比temp大，那么比它更大的数也肯定比temp大
                    break;
                }
            }

        }

    }

}

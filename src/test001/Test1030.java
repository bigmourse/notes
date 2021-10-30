package test001;

import java.util.ArrayList;

public class Test1030 {
    public static void main(String[] args) {
        ArrayList<Integer> arrint=new ArrayList<>();
        int number=1;
        String str="asd";
        new Solution1030().a(number,arrint,str);
        System.out.print("main中打印基础数据类型的值"+number+"   ");
        System.out.println("mian方法中基础数据类型的内存地址"+System.identityHashCode(number));
        System.out.print("main方法中对象值"+arrint+"   ");
        System.out.print("main对象哈希值"+arrint.hashCode()+"   ");
        System.out.println("main对象内存地址"+System.identityHashCode(arrint));
        System.out.print(str+"  ");
        System.out.println("字符串在main方法中的内存地址"+System.identityHashCode(str));
    }
}
class Solution1030{
    void a(int a, ArrayList<Integer> arr,String string){
        a=a+1;
        System.out.print("调用方法中基础数据类型的值"+a+"   ");
        System.out.println("调用方法中基础数据类型的内存地址"+System.identityHashCode(a));
        arr.add(12);
        System.out.print("调用方法中对象值"+arr+"   ");
        System.out.print("调用方法中对象哈希值"+arr.hashCode()+"   ");
        System.out.println("调用方法中对象内存地址"+System.identityHashCode(arr));
        string=string+"asd";
        System.out.print(string+"   ");
        System.out.println("字符串在调用方法中的内存地址"+System.identityHashCode(string));
    }
}

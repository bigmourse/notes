package test001;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int anInt=scanner.nextInt();
        int number=9876673;
        String str=String.valueOf(number);
        StringBuffer buf=new StringBuffer();
        ArrayList<Character> arr=new ArrayList();
        for(int i=0;i<str.length();i++){
            if(!arr.contains(str.charAt(i))){
                buf.append(str.charAt(i));
                arr.add(str.charAt(i));
            }
        }
        System.out.println(buf.toString());
        int n=Integer.parseInt(buf.reverse().toString());
        System.out.println(n);
    }
}

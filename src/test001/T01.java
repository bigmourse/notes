package test001;

/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 示例 1：
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 * 示例 2：
 * 输入：s = "axc", t = "ahbgdc"
 * 输出：false
 */
public class T01 {

    public static void main(String[] args) {
        String str1="abd";
        String str2="abd";
        boolean result=T01.solve(str1,str2);
        System.out.println(result);
    }

    public static boolean solve(String str1,String str2){
     StringBuilder s1=new StringBuilder(str1);
     StringBuilder s2=new StringBuilder(str2);
     boolean result=false;
     int index=0;
     int index2=0;
      //特殊情况：
     //思路：首先找到第一个匹配的字符，如果没有则直接返回false
        for(int i=0;i<str2.length();i++){
            for(int j=0+index2;j<str1.length();j++){

                if(s1.charAt(j)==s2.charAt(i)){
                    index++;
                    if(index==str2.length()){result=true;}
                    index2++;
                    break;
                }
                index2++;
            }
        }

     return result;
    }

}

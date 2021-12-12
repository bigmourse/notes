package test001;

public class Test3 {
    public static void main(String[] args) {
        String str="Def H";
     int n=-1;
     int m=1;
        String result=new Test3().test(str,n,m);
        System.out.println(result);
    }
    public String test(String str,int n,int m){
        String[] strarr=str.split(" ");
        StringBuffer result=new StringBuffer();
        for(int i=0;i<strarr.length;i++){
            StringBuffer buf=new StringBuffer();
            buf.append(strarr[i]);
            for(int j=0;j<buf.length();j++){
                int k=buf.charAt(j);
                if(k>=65&&k<=90){
                    if(k+n>90){
                        buf.replace(j,j+1,String.valueOf((char)(k+n-26)));
                    }
                    else if(k+n>=65&&k+n<=90) {
                        buf.replace(j,j+1,String.valueOf((char)(k+n)));
                    }
                    else if (k+n<65){
                        buf.replace(j,j+1,String.valueOf((char)(k+n+26)));
                    }
                }else if (k>=97&&k<=122){
                    if(k+m>122){
                        buf.replace(j,j+1,String.valueOf((char)(k+m-26)));
                    }
                    else if(k+m>=97&&k+m<=122){
                        buf.replace(j,j+1,String.valueOf((char)(k+m)));
                    }
                    else if (k+m<97){
                        buf.replace(j,j+1,String.valueOf((char)(k+m+26)));
                    }

                }
            }
            if(i==strarr.length-1){result.append(buf.toString());break;}
            result.append(buf.toString()+" ");
        }
        return result.toString();

    }


}

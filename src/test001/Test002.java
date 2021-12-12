package test001;

public class Test002 {


        public static void main(String[] args) {

            int i,j;
            int c=0;
            for(i=2;i<=10000;i++) {

                for( j=2;j<i;j++) {

                    if (i%j==0)               //如被整除跳出循环
                        break;
                }
                if (j>=i) {

                    System.out.print(" "+i+"\t");
                    c++;                    //每行显示八个数
                    if (c==8) {

                        System.out.println();
                        c=0;
                    }
                }
            }
        }



}

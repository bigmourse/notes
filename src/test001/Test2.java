package test001;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

        public static void main(String[] args) {
            System.out.println(1);
            new Thread(){
                @Override
                public void run() {
                    for(int i=0;i<10;i++){
                        System.out.println(i);
                    }

                }
            }.start();

        }

}

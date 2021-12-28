package test001;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class txt {
    public static void main(String[] args) throws IOException {
        String[] arrstr=new String[]{"0","180.0","180.0","0"};
        int strLength=arrstr.length;
        String type="A";

//        int[] arrint=new int[]{0,1,1,0,1,0};
//        int strLength=arrint.length;
//        String type="theta";


        String path="d:/Users/pc/Desktop/方案/point2/point2.vtmu_pack/Inputs/SSFBG_"+String.valueOf(strLength)+"_"+type+".txt";
        File fileName=new File(path);
        if (!fileName.exists()) {
            try {
                fileName.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.err.println(fileName + "已创建！");
        }
        FileWriter fw=new FileWriter(fileName);

        for(int i=0;i<strLength;i++){
            fw.write("// Code-"+arrstr[i]+" grating:\n");
            fw.write("# CosineGrating\n");
            fw.write("# Phase (deg) = "+arrstr[i]+"\n");
            fw.write("# Delta_n (.) = 5.0e-4\n");
            fw.write("# Period (nm) = 533.9123\n");
            fw.write("# Z (mm) = "+String.valueOf(i*0.6)+" "+String.valueOf((i+1)*0.6)+"\n");
            fw.write("# EndCosineGrating\n");
            fw.write("\n");
        }

//        for(int i=0;i<strLength;i++) {
//            fw.write("// Code-"+String.valueOf(arrint[i])+" grating:\n");
//            fw.write("# CosineGrating\n");
//            fw.write("# Phase (deg) = 0.0\n");
//            fw.write("# Delta_n (.) = " + String.valueOf(5.0e-4*arrint[i]) + "\n");
//            fw.write("# Period (nm) = 533.9123\n");
//            fw.write("# Z (mm) = " + String.valueOf(i * 0.6) + " " + String.valueOf((i + 1) * 0.6) + "\n");
//            fw.write("# EndCosineGrating\n");
//            fw.write("\n");
//        }

        fw.flush();
        fw.close();

    }

}

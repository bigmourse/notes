package test001;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class txt {
    public static void main(String[] args) throws IOException {
//      读excel中频率对应的有效折射率，并计算出光栅的周期（192Thz-0.0001Thz-195Thz）
        String filePath = "d:/Users/pc/Desktop/方案/point2/point2.vtmu_pack/Inputs/neff_data.csv";
        FileReader fr=new FileReader(filePath);
        BufferedReader reader=new BufferedReader(fr);
        double frequency=193.6145;//Thz单位的频率
        int number=(int)((frequency-192.0)*10000)+7;//频率在csv表格中的第几行
        String line=null;
        int forNumber=0;
        double neff=0;
        while ((line=reader.readLine())!=null )
        {
            if(number==forNumber)
            {
                String[] item=line.split(",");//每一行是以逗号为间隔的数据格式
                String last=item[item.length-1];
                neff=Double.parseDouble(last);
//                System.out.println(last);
                break;
            }
            forNumber++;
        }
        fr.close();

//        阿尔玛序列H
//        String[] H8_1=new String[]{"180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0"};//全1
        String[] H8_2=new String[]{"180.0","0","180.0","0","180.0","0","180.0","0"};
        String[] H8_3=new String[]{"180.0","180.0","0","0","180.0","180.0","0","0"};
        String[] H8_4=new String[]{"180.0","0","0","180.0","180.0","0","0","180.0"};
        String[] H8_5=new String[]{"180.0","180.0","180.0","180.0","0","0","0","0"};
        String[] H8_6=new String[]{"180.0","0","180.0","0","0","180.0","0","180.0"};
        String[] H8_7=new String[]{"180.0","180.0","0","0","0","0","180.0","180.0"};
        String[] H8_8=new String[]{"180.0","0","0","180.0","0","180.0","180.0","0"};

//        String[] H16_1=new String[]{"180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0"};//全1
        String[] H16_2=new String[]{"180.0","0","180.0","0","180.0","0","180.0","0","180.0","0","180.0","0","180.0","0","180.0","0"};
        String[] H16_3=new String[]{"180.0","180.0","0","0","180.0","180.0","0","0","180.0","180.0","0","0","180.0","180.0","0","0"};
        String[] H16_4=new String[]{"180.0","0","0","180.0","180.0","0","0","180.0","180.0","0","0","180.0","180.0","0","0","180.0"};
        String[] H16_5=new String[]{"180.0","180.0","180.0","180.0","0","0","0","0","180.0","180.0","180.0","180.0","0","0","0","0"};
        String[] H16_6=new String[]{"180.0","0","180.0","0","0","180.0","0","180.0","180.0","0","180.0","0","0","180.0","0","180.0"};
        String[] H16_7=new String[]{"180.0","180.0","0","0","0","0","180.0","180.0","180.0","180.0","0","0","0","0","180.0","180.0"};
        String[] H16_8=new String[]{"180.0","0","0","180.0","0","180.0","180.0","0","180.0","0","0","180.0","0","180.0","180.0","0"};
        String[] H16_9=new String[]{"180.0","180.0","180.0","180.0","180.0","180.0","180.0","180.0","0","0","0","0","0","0","0","0"};
        String[] H16_10=new String[]{"180.0","0","180.0","0","180.0","0","180.0","0","0","180.0","0","180.0","0","180.0","0","180.0"};
        String[] H16_11=new String[]{"180.0","180.0","0","0","180.0","180.0","0","0","0","0","180.0","180.0","0","0","180.0","180.0"};
        String[] H16_12=new String[]{"180.0","0","0","180.0","180.0","0","0","180.0","0","180.0","180.0","0","0","180.0","180.0","0"};
        String[] H16_13=new String[]{"180.0","180.0","180.0","180.0","0","0","0","0","0","0","0","0","180.0","180.0","180.0","180.0"};
        String[] H16_14=new String[]{"180.0","0","180.0","0","0","180.0","0","180.0","0","180.0","0","180.0","180.0","0","180.0","0"};
        String[] H16_15=new String[]{"180.0","180.0","0","0","0","0","180.0","180.0","0","0","180.0","180.0","180.0","180.0","0","0"};
        String[] H16_16=new String[]{"180.0","0","0","180.0","0","180.0","180.0","0","0","180.0","180.0","0","180.0","0","0","180.0"};


//        m序列
        String[] m7_1=new String[]{"0","180.0","180.0","0","180.0","0","0"};
        String[] m7_2=new String[]{"180.0","0","180.0","0","0","0","180.0"};
        String[] m7_3=new String[]{"0","0","180.0","180.0","0","180.0","0"};
        String[] m7_4=new String[]{"180.0","180.0","0","180.0","0","0","0"};
        String[] m7_5=new String[]{"0","180.0","0","0","0","180.0","180.0"};
        String[] m7_6=new String[]{"180.0","0","0","0","180.0","180.0","0"};
        String[] m7_7=new String[]{"0","0","0","180.0","180.0","0","180.0"};

        String[] m15_1=new String[]{"0","180.0","180.0","180.0","0","180.0","180.0","0","0","180.0","0","180.0","0","0","0"};
        String[] m15_2=new String[]{"180.0","0","180.0","180.0","0","0","180.0","0","180.0","0","0","0","0","180.0","180.0"};
        String[] m15_3=new String[]{"0","0","180.0","180.0","180.0","0","180.0","180.0","0","0","180.0","0","180.0","0","0"};
        String[] m15_4=new String[]{"180.0","180.0","0","180.0","180.0","0","0","180.0","0","180.0","0","0","0","0","180.0"};
        String[] m15_5=new String[]{"0","180.0","0","180.0","0","0","0","0","180.0","180.0","180.0","0","180.0","180.0","0"};
        String[] m15_6=new String[]{"180.0","0","0","180.0","0","180.0","0","0","0","0","180.0","180.0","180.0","0","180.0"};
        String[] m15_7=new String[]{"0","0","0","180.0","180.0","180.0","0","180.0","180.0","0","0","180.0","0","180.0","0"};
        String[] m15_8=new String[]{"180.0","180.0","180.0","0","180.0","180.0","0","0","180.0","0","180.0","0","0","0","0"};
        String[] m15_9=new String[]{"0","180.0","180.0","0","0","180.0","0","180.0","0","0","0","0","180.0","180.0","180.0"};
        String[] m15_10=new String[]{"180.0","0","180.0","0","0","0","0","180.0","180.0","180.0","0","180.0","180.0","0","0"};
        String[] m15_11=new String[]{"0","0","180.0","0","180.0","0","0","0","0","180.0","180.0","180.0","0","180.0","180.0"};
        String[] m15_12=new String[]{"180.0","180.0","0","0","180.0","0","180.0","0","0","0","0","180.0","180.0","180.0","0"};
        String[] m15_13=new String[]{"0","180.0","0","0","0","0","180.0","180.0","180.0","0","180.0","180.0","0","0","180.0"};
        String[] m15_14=new String[]{"180.0","0","0","0","0","180.0","180.0","180.0","0","180.0","180.0","0","0","180.0","0"};
        String[] m15_15=new String[]{"0","0","0","0","180.0","180.0","180.0","0","180.0","180.0","0","0","180.0","0","180.0"};


//        String[] arrstr=new String[]{"0","180.0","180.0","0","0","180.0","180.0","180.0","180.0","180.0","0","0","180.0","0","180.0","0","0","180.0","0","180.0","0","0","180.0","0","0","180.0","180.0","180.0","0","0","180.0","0",};
        //      指定使用哪个码字类型，并码字的第几行
        String[] arrstr=m15_1;
        String str="1";
        int strLength=arrstr.length;
        String type="theta";


//        int[] arrint=new int[]{1,0,1,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,0,0,1,1};
//        int strLength=arrint.length;
//        String type="A";


        //        计算光栅的周期和延迟
        double L=0.6e-3*strLength;
        int c=299792458;
        double t=2*L*neff/c;
        double period=c/2/neff/(frequency*1e12)*1e9;


//        创建SSFBG文件
        String path="d:/Users/pc/Desktop/方案/point2/point2.vtmu_pack/Inputs/D_SSFBG_"+String.valueOf(strLength)+"_"+str+"_"+type+".txt";
//        String path="d:/Users/pc/Desktop/方案/point2/point2.vtmu_pack/Inputs/SSFBG_"+String.valueOf(strLength)+"_"+str+"_"+type+".txt";
        File fileName=new File(path);
        if (!fileName.exists()) {
            try {
                fileName.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("初始文件已创建！");
        }
        System.out.println("文件已创建");
        FileWriter fw=new FileWriter(fileName);


//        SSFBG——相位型
        for(int i=0;i<strLength;i++){
            fw.write("// 延迟"+String.valueOf(t)+":\n");
            fw.write("// Code-"+arrstr[i]+" grating:\n");
            fw.write("# CosineGrating\n");

            if (arrstr[i]=="0")
                arrstr[i]="180.0";
            else
                arrstr[i]="0";

            fw.write("# Phase (deg) = "+arrstr[i]+"\n");
            fw.write("# Delta_n (.) = 5.0e-4\n");
            fw.write("# Period (nm) = "+String.valueOf(period)+"\n");
            fw.write("# Z (mm) = "+String.valueOf(i*0.6)+" "+String.valueOf((i+1)*0.6)+"\n");
            fw.write("# EndCosineGrating\n");
            fw.write("\n");
        }


//        SSFBG——幅度型
//        for(int i=0;i<strLength;i++) {
//            if(arrint[i]==1)
//            {
//                fw.write("// 延迟"+String.valueOf(t)+":\n");
//                fw.write("// Code-" + String.valueOf(arrint[i]) + " grating:\n");
//                fw.write("# CosineGrating\n");
//                fw.write("# Phase (deg) = 0.0\n");
//                fw.write("# Delta_n (.) = " + String.valueOf(5.0e-4) + "\n");
//                fw.write("# Period (nm) = "+String.valueOf(period)+"\n");
//                fw.write("# Z (mm) = " + String.valueOf(i * 0.6) + " " + String.valueOf((i + 1) * 0.6) + "\n");
//                fw.write("# EndCosineGrating\n");
//                fw.write("\n");
//            }
//
//        }


        fw.flush();
        fw.close();

    }

}

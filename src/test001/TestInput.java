package test001;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.regex.Pattern;

public class TestInput {

    public static void main(String[] args) {
        ArrayList<String> arrs=new ArrayList<>();

        String str =new String("sdf sdf sf.sdfa");
        System.out.println(str.charAt(1));
        String[] arr=str.split("\\.");
        for(String s:arr){
            System.out.println(s);
        }


//int[] a=new int[4];
//int i=a.length;
//String str="saf";
//str.length();

//        String str="a=1";
//        String[] strArr=str.split("=");
//        int i=Integer.parseInt(strArr[1]);



//        Scanner scanner=new Scanner(System.in);
////        方法1：避免死循环，选定一个结束符
//        int count=4;
//        while(!scanner.hasNext("@")){
//            System.out.println(scanner.next());
//            count--;
//            if(count==0){break;}
//        }
//        while(scanner.hasNextLine()){
//            String str=scanner.nextLine();
//            if(str.equals(""))break;
//            System.out.println(str);
//        }


//        System.out.println("end");
//        方法二：避免死循环，选定读入次数，但是必须多输入一次
//        int count=2;
//        while(scanner.hasNext()&&count>0){
//            System.out.println(scanner.next());
//            count--;
//        }
//        System.out.println("跳出键入");


//        String str1=scanner.next();
//        String[] strArr1=str1.split("=");
//        int target1=Integer.parseInt(strArr1[1]);
//        String str2=scanner.next();
//        String[] strArr2=str2.split("=");
//        int target2=Integer.parseInt(strArr2[1]);
//        int ij=0;

//        ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<Integer, String>();
//        concurrentHashMap.put(1,"aa");
//        concurrentHashMap.put(2,"cc");
//        concurrentHashMap.put(3,"bb");
//        concurrentHashMap.remove(1);
//        concurrentHashMap.replace(2,"aa");
//        System.out.println(concurrentHashMap.get(2));
//        System.out.println(concurrentHashMap.containsKey(2));
//        System.out.println(concurrentHashMap.containsValue("cc"));

//        Vector vector=new Vector();
//        vector.add("asd");
//        vector.add("aer");
//        vector.add("sdf");
//        vector.add("a23d");
//        vector.remove(1);
//        vector.remove("asd");
//        vector.set(1,"sdf");
//        System.out.println(vector.toString());
//        CyclicBarrier cyclicBarrier=new CyclicBarrier(5);
//        cyclicBarrier.await();
//        CountDownLatch countDownLatch=new CountDownLatch(2);
//        countDownLatch.countDown();
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        HashMap<Integer,String> map2=new HashMap<>();
//        map2.put(1,"dsf");
//        map2.put(3,"a2f");
//        map2.put(2,"dgdf");
//        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer, String>(map2);
//        System.out.println(linkedHashMap.keySet().iterator().next());
//        HashMap<Integer,String> map=new HashMap<>();
//        map.putAll(map2);
////        map.remove(2);
//        System.out.println(map.containsValue("a2f"));
//        map.replace(2,"222");
//        System.out.println(map.containsKey(2));
//        System.out.println(map.get(2));

//        LinkedList list=new LinkedList();
//        list.add("safd");
//        list.add("af");
//        list.add("afd");
//        list.add("sd");
//        list.add("safd");
//      PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>((o1,o2)->{o2-o1});
//      priorityQueue.add(1);

//        ArrayList list2=new ArrayList();
//        list2.add("axa");
//        list2.add("dsfa");
//        list2.add("ba");
//
//        ArrayList list=new ArrayList();
//        list.add("123");
//        list.addAll(list2);
//        System.out.println(list.get(1));
//        System.out.println(list.toString());


//        System.out.println(list.get(0));
////        list.remove(0);
//        list.set(0,"aa");
//        System.out.println(list.indexOf("aa"));
//        System.out.println(list.contains("12"));


//        Integer[] str=new Integer[4];
//        str[0]=4;
//        str[1]=2;
//        str[2]=1;
//        str[3]=11;
//        System.out.println(Arrays.asList(str).get(1));
//        System.out.println(Arrays.toString(str).charAt(0));
//        Arrays.sort(str);

//      Runtime.getRuntime().gc();

//        String str=new String("a=1 b=2");
//        StringBuffer buf=new StringBuffer(str);
//        System.out.println(str.compareTo("a=1 b="));

//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.next();


    }
}

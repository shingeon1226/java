package day_11_array;

public class Sungjuk {

    public static void main(String[] args) {
        
        String[] names = {"tom", "ann", "jun", "jack", "jhon", "alen"};
        int[] kor = {50, 30, 90, 55, 66, 77};
        int[] math = {33, 44, 55, 99, 67, 88};
        int i = 0;
        int[] sum = new int[6];
        int[] avg = new int[6];
        		
        for (i = 0; i < names.length; i++) {
            sum[i] = kor[i] + math[i];  
            avg[i] =(int) sum[i] / 2;  
        }

        System.out.println("no  name  kor  math  total  avg");
        System.out.println("===============================");
        for (i = 0; i < names.length; i++) {
            System.out.printf("%-3d %-6s %-4d %-4d %-5d %d\n",
                    (i + 1), names[i], kor[i], math[i], sum[i], avg[i]);
        }
        int mathsum =0, korsum=0,totalsum=0, avgsum=0;
        for(i=0; i<6; i++) {
        	mathsum +=math[i];
        	korsum	+=kor[i];
        	totalsum+=sum[i];
        	avgsum	+=avg[i];
        }
        System.out.println("------------------------------");
        System.out.print("    전체총점:");
        System.out.printf("%3d %4s %4d %5d ",
        		korsum,mathsum ,totalsum,(int)avgsum/6);
        
    }
}
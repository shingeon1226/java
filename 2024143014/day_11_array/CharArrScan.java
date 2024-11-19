package day_11_array;

import java.util.Scanner;

public class CharArrScan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       char[] ch=new char[10];
       
       int i =0;
       while(true) {
    	   System.out.print("문자입력>>");
    	   String str = scan.next();
    	   ch[i] =str.charAt(0);
    	   
    	   System.out.print(ch[i]+"  ");
    	   if(ch[i] =='r'|| ch[i] =='R') {
    	   System.out.println("종료");
    	   break;
    	   
    	   }
       }
    }
}
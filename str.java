import java.util.Scanner;

import javax.print.StreamPrintService;

public class str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.trim().split(" ");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
           res+=arr[i];
           res+=" ";
        }
        System.out.println(res);
        //Or we can also use StringBuffer to make it reverse....
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        System.out.println(str);
    }
}

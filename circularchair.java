import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class circularchair{
    public static void main(String[] args) throws Exception{
        BufferedReader obj2=new BufferedReader(new InputStreamReader(System.in));
        String a=obj2.readLine();
        String[] str=a.split("\\s+");
        int[] arr=new int[str.length];
        for(int i=0;i<str.length;i++){
           arr[i]=Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(arr));
        Scanner obj=new Scanner(System.in);
        int shift=obj.nextInt();
        circularchair main=new circularchair();
        System.out.println(Arrays.toString(main.rounding(arr,shift)));
    }
    int[] rounding(int[] array,int move){
        int m=move%array.length;
        if(m==0){
            return array;
        }
        else{
            int temp=0;
           while(m!=0){
              temp=array[array.length-1];
              for(int j=array.length-2;j>=0;j--){
              array[j+1]=array[j];
            }
            m--;
            array[0]=temp;
           }
           
        }
        return array;
    }
}
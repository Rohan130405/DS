package DS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class io {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] s=bf.readLine().split("\\s+");
        int[] arr=new int[s.length];
        int i=0;
        for(String ele:s){
           arr[i]=Integer.parseInt(ele);
           System.out.print(arr[i++]+" ");
        }
        System.out.println();
        System.out.println(arr.length);
        
    }
}

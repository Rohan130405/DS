package DS;
import java.util.Arrays;

public class varargs {
    static <T> void ellipsis(T...t){
         System.out.println(Arrays.toString(t)); 
    }
    public static void main(String[] args) {
        ellipsis(1,2,3,4,5,6);
    }
}

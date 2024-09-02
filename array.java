import java.util.*;
public class array {
    public static void main(String[] args){
        ArrayList<String> bikes =new ArrayList<String>();
        bikes.add("Bullet");
        bikes.add("GT");
        bikes.add("R15");
        bikes.add("Ninja");
        System.out.println(bikes);
        System.out.println(bikes.get(2));
        System.out.println(bikes.set(0,"Royal Enfield"));
        System.out.println(bikes);
        System.out.println(bikes.size());
        Collections.sort(bikes);
        System.out.println(bikes);
        String[] arr=bikes.toArray(new String[bikes.size()]);//converting array list to array.
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1]="0";
        List<String> list=Arrays.asList(arr);
        System.out.println(list);
    }
}

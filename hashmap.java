import java.util.HashMap;
public class hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("rohan",18);
        obj.put("naga",17);
        obj.put("harsha",18);
        obj.put("rohan",19);
        System.out.println(obj.get("rohan"));
        System.out.println(obj.containsKey("rohan"));//returns true if contains the key in the hash map.
        System.out.println(obj.containsValue(17));//returns true if contains the value in the hash map.
        obj.put("rohan",20);//updates the existing key value.
        System.out.println(obj.get("rohan"));
        obj.putIfAbsent("rohan",21);//put only if no such key is available in the map.
        System.out.println(obj);
        System.out.println(obj.size());//size of map.
        obj.remove("harsha");//removes the specified key.
        System.out.println(obj);
        System.out.println(obj.keySet());//returns all keys.
        System.out.println(obj.values());//reutrns all values.
    }
}

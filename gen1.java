package DS;
public class gen1 {
    
    public static void main(String[] args) {
        System.out.println(generiMethod(1));
        System.out.println(generiMethod("rohan"));
        
    }
    static <U> U generiMethod(U t){
        return t;
    }
}

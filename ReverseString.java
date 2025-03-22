public class ReverseString{
    public static void main(String[] args){
        String str = "hello i nikita";
        StringBuilder reverced = new StringBuilder(str).reverse();
        System.out.println(reverced);
    }
}
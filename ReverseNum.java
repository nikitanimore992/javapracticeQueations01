


public class ReverseNum{
    public static void main(String[] args){
        int num = 123;
        int res = 0;
        while(num!=0){
           
            res = res * 10 + num%10;
            num /=10;
        }
        System.out.println(res);
    }
}
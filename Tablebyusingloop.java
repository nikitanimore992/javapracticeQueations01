

import java.util.*;

public class Tablebyusingloop{
    public static void main(String[] args){
        Scanner sk = new Scanner (System.in);
        int n , tab;
        System.out.println("Enter any Num : ");
        n = sk.nextInt();
        for (int i=1; i<=10; i++){
                tab = n*i;
                System.out.println(n+" * "+i+" = "+tab);
        }
    
    }
}
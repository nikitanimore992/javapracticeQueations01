
import java.util.Scanner;

public class getInputfromUser{
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        String  name = sk.next();
        System.out.println("Enter you last name :");
        String lname = sk.next();
        System.out.println("your name is :"+name+ " "+lname);

    }
}
import java.util.*;
public class ExceptionDemo {
    public static void main(String args[]){
        int a,b,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers:");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            result=a/b;
            System.out.println("The result = "+result);
        } catch (Exception e) {
         System.out.println("Exception n caught:Division by zero");
        }
    }
}

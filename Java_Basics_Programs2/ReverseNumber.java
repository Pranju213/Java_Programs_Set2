import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rev=0;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        //num=num/10;
        System.out.println(rev);

    }
}

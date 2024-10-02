import java.util.*;
public class FindSubstringsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sub;
        System.out.println("Enter a string to print it's all substrings");
        String s=sc.nextLine();
        int length=s.length();
        System.out.println("Substrings of "+s+"are:");
        for(int i=0;i<length;i++){
            for(int j=1;j<=length-i;j++){
                sub=s.substring(i,i+j);
                System.out.println(sub);
            }
        }
    }
}

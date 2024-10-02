import java.util.*;
public class PalidromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String original,reverse,temp;
        System.out.println("Enter a String:");
        original=sc.nextLine();
        temp=original;
        reverse="";
        for(int i=original.length()-1;i>=0;i--){
         reverse=reverse+original.charAt(i);
        }
        if(temp.equals(reverse)){
            System.out.println("String is palidrome");
        }
        else{
            System.out.println("String is not palidrome");
        }
        

    }
}

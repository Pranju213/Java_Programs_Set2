import java.util.*;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first String : ");
        String str1=sc.nextLine();
        System.out.println("Enter a Second String : ");
        String str2=sc.nextLine();
        if(str1.compareTo(str2)>0){
         System.out.println("First String is greater than second string");
        }
        else if(str1.compareTo(str2)<0){
            System.out.println("First string is smaller than second string");
        }
        else{
            System.out.println("Both string are equal");
        }
    }
}
// hello and Hello--->hello is greater than Hello because the ASCII value of h is greater than H.
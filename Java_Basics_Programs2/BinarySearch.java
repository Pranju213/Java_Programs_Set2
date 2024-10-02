import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        int i,first,last,middle,n,search;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter a value to find:");
        search=sc.nextInt();
        first=0;
        last=n-1;
        middle=(first+last)/2;
        if(array[middle]<search){
            first=middle+1;
        }
        else if(array[middle]==search){
         System.out.println(search+"found at location" +(middle+1)+ ".");
         //break;
        }
        else{
            last=middle-1;
            middle=(first+last)/2;
        }
        if(first>last){
            System.out.println(search+"is not present in the list.\n");
        }
        while(first<=last){

        }
    }
}

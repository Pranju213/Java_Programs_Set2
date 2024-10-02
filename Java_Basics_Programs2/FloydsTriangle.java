import java.util.*;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1;
        System.out.println("Enter the no of rows you want to print:");
        int n=sc.nextInt();
        System.out.println("Floyds Triangle---->");
        for(int c=1;c<=n;c++){
            for(int d=1;d<=c;d++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

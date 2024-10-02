import java.util.*;
public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns in matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] m=new int[r][c];
        System.out.println("Enter the element of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int[][] t=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[j][i]=m[i][j];
            }
        }
        System.out.println("The transpose :");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

public class ExceptionDemo1 {
    public static void main(String args[]){
     String[] sub={"C++","Java","Python","OS","CN"};
     System.out.println("The list of subject ---->");
     try {
         for(int i=1;i<=5;i++){
            System.out.println(sub[i]);
         }
     } 
     catch (Exception e) {
        System.out.println(e);
     }
    }
}

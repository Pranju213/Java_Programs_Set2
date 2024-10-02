public class ReverseString {
    public static void main(String args[]){
        String s="Prajkta";
        String a="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            a=a+s.charAt(i);
        }
        System.out.println(a);
    }
}

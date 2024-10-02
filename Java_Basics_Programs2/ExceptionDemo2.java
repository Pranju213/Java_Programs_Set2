
import java.math.BigInteger;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            BigInteger data[]=new BigInteger[1000000000];
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block will execute always");
        }
    }
}

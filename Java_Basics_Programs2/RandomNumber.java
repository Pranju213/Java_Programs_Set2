import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println("Random number between 1 to 100 ---->");
        int num=r.nextInt(100);
        System.out.println(num);
    }
}


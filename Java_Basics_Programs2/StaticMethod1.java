public class StaticMethod1 {
    StaticMethod1(){
        System.out.println("Constructor of class StaticMethod1 ");
    }
    void m1(){
        System.out.println("Power gone! Shut down your PC soon");
    }
        public static void main(String[] args) {
        StaticMethod1 sm=new StaticMethod1();
        Laptop lp=new Laptop();
        sm.m1();
        lp.m2();
    }
}
class Laptop{
        Laptop(){
            System.out.println("Constructor of Laptop class ");
        }
        void m2(){
          System.out.println("99% battery available");
        }
    }


 
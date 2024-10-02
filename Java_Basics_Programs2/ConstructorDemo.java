public class ConstructorDemo {
    ConstructorDemo()
    {
        System.out.println("Constructor method is called ");
    }
    ConstructorDemo(int x,int y)
    {
      System.out.println("The value of x= "+x+" and y="+y+" ");
    }
    public static void main(String args[])
    {
      ConstructorDemo cd=new ConstructorDemo();
      ConstructorDemo cd1=new ConstructorDemo(72,35);
    }
}

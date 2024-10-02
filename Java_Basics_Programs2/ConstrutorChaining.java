class GrandParent{
    int a;
    public GrandParent(int a) {
     this.a=a;
    }
}
class Parent extends GrandParent{
    int b;
    public Parent(int a,int b) {
        super(a);
        this.b=b;
    }
void show(){
    System.out.println("GrandParents a="+a);
    System.out.println("Parents b="+b);
}
}
public class ConstrutorChaining {
    public static void main(String[] args) {
        Parent p=new Parent(12,35);
        p.show();
    }
}
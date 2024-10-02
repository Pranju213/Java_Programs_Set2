public class ConstructorDemo1 {
    String name;
    ConstructorDemo1(){
        System.out.println("Constructor Method is Called ");
    }
    ConstructorDemo1(String t){
        this.name=t;
    }
    void setName(String t){
        name=t;
    }
    void getName(){
        System.out.println("Language Name:"+name);
    }
    public static void main(String[] args) {
       ConstructorDemo1 cd=new ConstructorDemo1();
        ConstructorDemo1 cpp=new ConstructorDemo1("C++");
        ConstructorDemo1 java=new ConstructorDemo1("Java");
        //cpp.setName("C++");
        cpp.getName();
        java.getName();
     }
}


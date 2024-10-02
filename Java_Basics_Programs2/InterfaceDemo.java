interface  InterfaceDemo{
    static final String lang="Java";
    public void display();
}
class Simple implements InterfaceDemo{
    public static void main(String[] args) {
        Simple s=new Simple();
        s.display();
}
    public void display(){
        System.out.println(lang+"is awesome");
}
}

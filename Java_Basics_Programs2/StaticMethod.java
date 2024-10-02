class StaticMethod {
    public static void main(String[] args) {
        display();
        StaticMethod sm=new StaticMethod();
        sm.show();
    }
    static void display(){
        System.out.println("Programming is amazing ");
    }
    void show(){
        System.out.println("Java is awesome ");
    }
}

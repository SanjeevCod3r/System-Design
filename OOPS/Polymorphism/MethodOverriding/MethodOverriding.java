class Test{
    void show(){
        System.out.println("1");
    }
}
class Xyz extends Test{
    void show(){
        System.out.println("2");
    }
}
class MethodOverriding{
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        Xyz x = new Xyz();
        x.show();
    }
}
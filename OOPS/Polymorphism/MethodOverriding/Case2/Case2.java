class Test{
    protected void show(){
        System.out.println("1");
    }
}
class Xyz extends Test{
    public void show(){
        System.out.println("2");
    }
}
public class Case2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        Xyz x = new Xyz();
        x.show();
    }
}

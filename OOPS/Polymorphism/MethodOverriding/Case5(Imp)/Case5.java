class Test{
    void show(){
        System.out.println("1");
    }
}
class Xyz extends Test{
    void show(){
        super.show();
        System.out.println("2");
    }
}

public class Case5 {
    public static void main(String[] args) {
        Xyz ob = new Xyz();
        ob.show();
    }
}

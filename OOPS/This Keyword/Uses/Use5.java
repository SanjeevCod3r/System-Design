// this can be used to pass an argument in the constructor call.
class Test {
    Test(ThisDemo td) {
        System.out.println("Test class Constructor");
    }
}
class ThisDemo {
    void m1() {
        Test t = new Test(this);
    }

}

public class Use5 {
    public static void main(String[] args) {
        ThisDemo t = new ThisDemo();
        t.m1();
    }

}

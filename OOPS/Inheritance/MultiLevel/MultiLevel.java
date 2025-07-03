class A {
    void showA() {
        System.out.println("A class method");
    }
}

class B extends A {
    void showB() {
        System.out.println("B class method");
    }
}

class C extends B {
    void showC() {
        System.out.println("C class method");
    }

}

public class MultiLevel {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();
        B obj2 = new B();
        obj2.showA();
        obj2.showB();
        C obj3 = new C();
        obj3.showA();
        obj3.showB();
        obj3.showC();
    }
}

class Test{
    void show(Object a){
        System.out.println("Object method");
    }
    void show(String a){
        System.out.println("String method");
    }
}
public class Case2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show('a'); // Object Method
        t.show("abc"); // String Method
    }
}

/*
 Object: Object is the parent class of all the classes in java
    |
  String

  While, resolving overloaded Method, Compiler will always give precedence for the child type argument than 
  compared with parent type argument.
 */
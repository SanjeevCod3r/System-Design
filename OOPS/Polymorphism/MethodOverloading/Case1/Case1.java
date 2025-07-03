
class Test{
    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("String method");
    }
}
public class Case1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show('a');  // int method -> Automatic Promotion
    }
}

/*
 Automatic Promotion:
 One type promoted to another implicitly if no matching datatype is found.
 */

 /*
  byte -> short -> int -> long and double and float
  char -> int -> float -> double
  */
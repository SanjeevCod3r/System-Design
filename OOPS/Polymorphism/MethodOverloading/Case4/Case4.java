class Test{
    void show(int a){
        System.out.println("int method");
    }
    void show(int... a){
        System.out.println("VarArgs Method");
    }
}
public class Case4 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10);
        t.show(10, 20, 30, 40, 50);
    }
}
/*
 The varrags allows the method to accept zero or muliple arguments.
  Before varargs either we use overloaded method or take an array as the method parameter 
  but it was not considered good because it leads to the maintenance problem. 
  If we don't know how many argument we will have to pass in the method, varargs is the better approach.
  -> Least Priority
 */
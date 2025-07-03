// this can used to return the current class instance from the method.
class ThisDemo{
    ThisDemo m1(){
        return this;
    }
}
public class Use6 {
    public static void main(String[] args) {
        ThisDemo t = new ThisDemo();
        t.m1();
    }
}

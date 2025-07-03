// this() can be used to invoke current class constructor.
class ThisDemo{
    ThisDemo(){
        System.out.println("No-Arg Constructor");
    }
    ThisDemo(int i){
        this();
        System.out.println("Parameterised Constructor");
    }
}
public class Use3 {
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo(10);
    }
}

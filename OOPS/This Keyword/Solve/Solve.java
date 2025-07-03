class Test{
    int i;
    void setValue(int i){
        this.i=i;  // ------> solved
    }
    void show(){
        System.out.println(i);
    }
}
public class Solve {
    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(10);
        t.show();
}
}

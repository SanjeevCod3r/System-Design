
interface I1{
  public abstract void show();
}
class Test implements I1{
    public void show(){
        System.out.println("1");
    }
}
public class Interface {
   public static void main(String[] args) {
    Test t = new Test();
    t.show();
   } 
}

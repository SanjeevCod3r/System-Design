// this can be used to pass an argument in the method call.
class ThisDemo{
    void m1(ThisDemo td){
System.out.println("i am in m1 method");
    }
    void m2(){
        m1(this);
    }

}
public class Use4 {
  public static void main(String[] args) {
    ThisDemo td = new ThisDemo();
    td.m2();
  }  
}


// 2. this keyword can be used to invoke current class method (implicitly).
class ThisDemo{
    void Display(){
        System.out.println("Hello");
    }
    void show(){
        this.Display(); // Display();
    }
}
public class Use2 {
   public static void main(String[] args) {
    ThisDemo td = new ThisDemo();
    td.show();
   } 
}

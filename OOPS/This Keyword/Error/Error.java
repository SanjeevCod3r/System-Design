class Test{
int i;
void setValue(int i){
    i=i;
}
void show(){
    System.out.println(i);
}
}
public class Error {
   public static void main(String[] args) {
    Test t = new Test();
    t.setValue(10);
    t.show(); // 0 -> This is Error
   } 
}

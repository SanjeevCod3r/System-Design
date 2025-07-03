class Test{
    void show(StringBuffer a){
        System.out.println("StringBuffer Method");
    }
    void show(String a){
        System.out.println("String Method");
    }
}
public class Case3 {
   public static void main(String[] args) {
    Test t = new Test();
    t.show("abc");
    t.show(new StringBuffer("xyz"));
    t.show(null);
   } 
}
/*
 String and StringBuffer are at same level so "null" cannot be 
 refered, if refered , ambiguous error will occur.
 */
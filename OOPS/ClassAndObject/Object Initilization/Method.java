// 2. By Using Method
class Animal{
    String color;
    int age;
    void initObj(String c, int a){
        color = c;
        age = a;
    }
}
public class Method {
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.initObj("black", 5);
        System.out.println(buzo.color + " " + buzo.age);
    }
}

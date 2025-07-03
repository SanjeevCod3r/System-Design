// 1.By reference Variable
class Animal{
    String color;
    int age;
}
public class Reference {
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.color = "Black";
        buzo.age = 18;
        System.out.println(buzo.color + " " + buzo.age);
    }
}

class Birds{
    public void fly(){
        System.out.println("Birds can fly");
    }
}
class Animal{
    public void run(){
        System.out.println("Animal is running");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class ClassAndObject{
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.run();
        buzo.eat();

        Birds bird = new Birds();
        bird.fly();
    }
}
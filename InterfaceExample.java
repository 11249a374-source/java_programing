
interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}

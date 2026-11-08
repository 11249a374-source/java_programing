// Experiment 4(a): Handling inheritance in Java
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;
    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNo);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student("Ravi", 101);
        s.displayStudent();
    }
}

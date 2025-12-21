package OOPS;

// Parent class
class Person {
    protected String name;
    protected String address;
    protected int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}

// Child class (Inheritance)
class Student extends Person {
    private int marks;
    private String grade;

    Student(String name, String address, int age, int marks, String grade) {
        super(name, address, age);
        this.marks = marks;
        this.grade = grade;
    }

    


    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// Polymorphism example
class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}

public class PillarsOfOops {
    public static void main(String[] args) {

        Student s = new Student("Sachin", "M1", 21, 100, "A");
        s.disp();

        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10, 20, 30);
    }
}


// 1. Constructor Kaise Kaam Karta Hai?
// Jab aap new keyword ka use karke object banate hain (e.g., Student s = new Student();), toh Java backend mein ye steps follow karta hai:

// Memory Allocation: JVM heap memory mein object ke liye jagah banata hai.

// Default Initialization: Saare variables ko unki default values (jaise int ke liye 0, String ke liye null) mil jati hain.

// Constructor Execution: Iske baad constructor call hota hai jo aapki di hui values ko variables mein set karta hai.
😎😎😎😎😎
// 2. Types of Constructors
// Java mein basically teen tarah ke constructors hote hain:

// Default Constructor: Agar aap apni class mein koi constructor nahi likhte, toh Java compiler khud ek empty constructor add kar deta hai.

// No-Arg Constructor: Ye woh constructor hai jisme koi parameter nahi hota. Aap ise khud likhte hain taaki default values set kar sakein.

// Parameterized Constructor: Jaisa aapne apne pichle code mein use kiya tha (e.g., Student(String name, ...)). Ye specific values ke saath object banane mein kaam aata hai.
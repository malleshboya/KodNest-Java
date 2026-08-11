class student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

public class Student {
    public static void main(String[] args) {

        student s1 = new student();

        s1.roll = 22;
        s1.name = "Mallesh";
        s1.height = 5.5;

        System.out.println("Roll No: " + s1.roll);
        System.out.println("Name: " + s1.name);
        System.out.println("Height: " + s1.height);

        s1.run();
        s1.sleep();
    }
}
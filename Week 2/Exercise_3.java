//Complete the code segment to call the method  print() of class given class Printer to print the following.
//
//        --------------------------------
//        Hi! I am class STUDENT
//        Hi! I class SCHOOL.
//        --------------------------------


class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
        System.out.println(s);
    }
}

public class Exercise_3{
    public static void main(String[] args) {
// Create an object of class Printer

// Call 'print()' methods for desired output
        Printer p = new Printer();
        p.print("Hi! I am class STUDENT");
        p.print();
    }}
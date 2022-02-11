//Complete the code segment to call print() method of class Question by creating a method named ‘studentMethod()’.


// This is the main class Question
public class Exercise_4 {
    public static void main(String[] args) {
        // Object of the main class is created
        Exercise_4 q = new Exercise_4();
        // Print method on object of Question class is called
        q.studentMethod();
    }

    // 'print()' method is defined in class Question
    void print(Exercise_4 object) {
        System.out.print("Well Done!");
    }

    // Define a method named 'studentMethod()' in class Question
    void studentMethod() {
//  Question23 qq = new Question23();
        print(this);
    }
// Call the method named 'print()' in class Question
}


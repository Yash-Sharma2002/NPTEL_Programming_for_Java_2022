import java.util.Scanner;

public class Exercise_3 {
       public static void main(String[] args) {
              Scanner nsc = new Scanner(System.in);
              double radius = nsc.nextDouble();
              System.out.println(2 * Math.PI * radius);
              System.out.print(radius * Math.PI * radius);
       }
}
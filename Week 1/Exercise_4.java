// Complete the code segment to find the largest among three numbers x,y, and z. You should use if-then-else construct in Java.

import java.util.Scanner;  
public class Exercise_4 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
int z = s.nextInt();
int result = 0;
if(x>y){
  if(x>z){
    System.out.print(x);
  } else {
    System.out.print(z);
  }
} else {
  if(y>z){
    System.out.print(y);
  } else {
    System.out.print(z);
  }
}
       }
}



// We Can Also doo


// import java.util.Scanner;  
// public class Exercise1_2 {
//        public static void main(String[] args) {
// Scanner s = new Scanner(System.in); 
//         int x = s.nextInt(); 
//         int y = s.nextInt();
// int z = s.nextInt();
// int result = 0;
// if(x>y){
//   if(x>z){
//     result = x;
//   } else {
//     result = z;
//   }
// } else {
//   if(y>z){
//     result = y;
//   } else {
//     result = z;
//   }
// }
// System.out.print(result);
//        }
// }

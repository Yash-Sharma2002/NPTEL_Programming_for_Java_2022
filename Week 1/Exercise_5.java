// First n even numbers starting from zero(0).

import java.util.Scanner;
public class Exercise_5 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
      for(int i=0;i<n;i++){
        System.out.print(2*i+" ");
      }
    }
}
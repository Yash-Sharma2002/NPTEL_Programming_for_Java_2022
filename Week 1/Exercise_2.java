// Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.

import java.util.Scanner;
public class Exercise_2{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
        float sum = 0;
int max = 0;
  for(i=0;i<s;i++){
  sum+=arr[i];
    if(max<arr[i]){
      max=arr[i];
    }
  }
System.out.println(max);
System.out.print(sum/s);
    }
}
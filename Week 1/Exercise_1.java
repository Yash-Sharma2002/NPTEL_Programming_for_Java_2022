//For calculating Armstromg


import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int y=0;
           for(int i=n;i>0;i=i/10){
               y=y+1;
           }
           int sum=0;
           int num=0;
           for(int i=n;i>0;i=i/10){
               num = i%10;
               sum += (num*num*num);
           }
           if(sum==n){
               System.out.print(1);
           } else {
           System.out.print(0);
           }
        }
    }
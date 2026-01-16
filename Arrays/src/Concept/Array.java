package DSA.Arrays.Concept;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    // Q:take the input of 2 numbers and print sum
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
//        int num1,num2,sum;
//
//        System.out.println("Enter 1st number:");
//        num1=scan.nextInt();
//        System.out.println("Enter 2st number:");
//        num2=scan.nextInt();
//        sum=num1+num2;
//        System.out.println(sum);
        int[] rollNo= {1,2,3,4,5};
       // System.out.println(rollNo[2]);//one way to print
        for (int i=0;i<rollNo.length;i++){
            System.out.print(rollNo[i]+" ");//another way to print array
        }
        //By using enhanced for loop
        for(int j:rollNo){
            System.out.print(j+" ");
        }
        System.out.println(Arrays.toString(rollNo));  



    }
}

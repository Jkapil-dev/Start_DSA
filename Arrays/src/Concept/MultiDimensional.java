package DSA.Arrays.Concept;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args){
        int[][] arr= new int[3][];//adding no. of rows is mandatory,for columns it's not mandatory
//        int[][] arr2D={
//                {1,2},
//                {3,4,5},
//                {6,7,8,9}
//        };
        Scanner scan=new Scanner(System.in);
        int[][] arr2D=new int[3][2];
        for(int row=0;row<arr2D.length;row++){
            for(int col=0;col<arr2D[row].length;col++){
                System.out.println("Enter ["+row+"]["+col+"] th element");
                arr2D[row][col]= scan.nextInt();
            }
        }

        for(int row=0;row<arr2D.length;row++){

            for(int col=0;col<arr2D[row].length;col++){
                System.out.print(arr2D[row][col]+"  ");

            }
            System.out.println();
        }
        //other way to do this
        for(int row=0;row<arr2D.length;row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }


    }
}

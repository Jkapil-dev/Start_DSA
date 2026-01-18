package Concept_and_application;

import java.util.Scanner;

public class SmallestLetter {
   public static void main(String[] args){
       char[] characterArray={'b','c','e','g'};
       Scanner in=new Scanner(System.in);
       System.out.println("Enter character:");
       char targetLetter=in.next().charAt(0);//.charAt(index)
       char answer=smallestLetter(characterArray,targetLetter);
       System.out.println(answer);
   }
   static char smallestLetter(char[] letters,char target){
       int start=0;
       int end=letters.length-1;

       while(start<=end){
           int mid=start+(end-start)/2;
           if(target<letters[mid]){
               end=mid-1;
           }else {
               start=mid+1;
           }
       }
       return letters[start % letters.length];
   }
}

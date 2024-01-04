package oops_30Dec;

import java.util.Scanner;

public class Lab128 {
    public static void main(String[] args) {
         String name = "Parmod";
         char[] charArray = name.toCharArray();

         int left = 0;
         int right = charArray.length-1;

         while (left<right){
             char temp = charArray[left];
             charArray[left] = charArray[right];
             charArray[right] = temp;
             left++;
             right--;
         }
         String rev = new String(charArray);
        System.out.println(rev);

    }
}

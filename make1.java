import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class make1{
     public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
         original = in.nextLine();

         int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
         reverse = reverse + original.charAt(i);

         System.out.println("Reverse of the string: " + reverse);
  }
}

    
}

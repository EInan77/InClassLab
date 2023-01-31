/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inclasslab;





/**
 *
 * @author Eren Inan
 */
import java.util.Scanner; 

        public class Inclasslab {

    public static void main(String[] args) {
      Scanner nums = new Scanner(System.in);  // Used to take user input, creates scanner object Nums
      System.out.print("Enter a 5 digit number: "); // Outputs indication for user to input a 5 digit number
      int Number = nums.nextInt(); // Takes  user input inserted by user places into integer variable Number
      
      //Example 5 digit number 42339
      //    42339/10000=4.2339 however the integer will take whole numbers so 
      // num 1 would take in the number 4
      // Therefore 5 digit number divided by 10000
      // Results in printing of the first digit of the 5 digit number
      int num1 = Number / 10000; 
      int num2 = (Number % 10000) / 1000;
      // 42339%10000 reveals the remainder of the 5 digit number divided by 10000
      //Remainder would be 2339 when divided by 1000 
      //it would be equal to the number 2.339 however integer is set to
      // the number 2 which is the 2nd digit of the number
      
      int num3 = (Number % 1000) / 100;
      // 42339%1000= 339/100=3.39 however the integer is set to three
      int num4 = (Number % 100) / 10;
      int num5 = Number % 10;
      
      System.out.printf("%3s%3s%3s%3s%3s", num1, num2, num3, num4, num5);
    //outputs integer variables formatted to have 3 spaces between each variable
    }
        }


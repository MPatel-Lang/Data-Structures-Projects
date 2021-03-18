// Program: RPS.java
// Written by: Mehul Patel
// Description: Write a program that allows the user to play "Rock, Paper, Scissors".  
// Challenges: using enums and random class
// Time Spent: 3hurs and 45 minutes
// Given Input:               Expected Output:
// --------------------          -------------------------
//1                                loss
//2                                 win
//1                                 win
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 10/25/2017         mp                    Created the program

/*filename: Anyname.java */
import java.util.Random;
import java.util.Scanner;

public class RPS
{

    public enum play{WIN, LOST, TIE}
            static {
    int pointComputer1 = 0, pointPlayer1 = 0;
                
                
    if (pointComputer1 >= 2)
        System.out.println("\nYou LOST...");
    else if (pointPlayer1 >= 2)
        System.out.println("\nYou WON...");

                
    }
    
    
    
    

public static void main(String[] args){
    

    Random rand = new Random();
    System.out.println("This is a game of Scissor-Rock-Paper.\n");
    
    int computer1, player1;
    int point = 1, pointComputer1 = 0, pointPlayer1 = 0;
    Scanner n = new Scanner(System.in);
    
         while((pointPlayer1 != 2) && (pointComputer1 != 2)){
        System.out.println("\nEnter 1 for Scissor\nEnter 2 for Rock\nEnter 3 for Paper");
        player1 = n.nextInt();
        computer1= rand.nextInt(3) + 1;

        if ((computer1 == 1) && (player1 == 3)){
            System.out.println("You Lose!");
            pointComputer1 += point;}
        else if ((computer1 == 2) && (player1 == 1)){
            System.out.println("You Lose!");
            pointComputer1 += point;}
        else if ((computer1 == 3) && (player1 == 2)){
            System.out.println("You Lose!");
            pointComputer1 += point;}
        else if ((computer1 == 1) && (player1 == 2)){
            System.out.println("You Win!");
            pointPlayer1 += point;}
        else if ((computer1 == 2) && (player1 == 3)){
            System.out.println("You Win!");
            pointPlayer1 += point;}
        else if ((computer1 == 3) && (player1== 1)){
            System.out.println("You Win!");
            pointPlayer1 += point;}
        else if ((computer1 == 1) && (player1 == 1)){
            System.out.println("It's a Draw!");}
        else if ((computer1 == 2) && (player1 == 2)){
            System.out.println("It's a Draw!");}
        else if ((computer1 == 3) && (player1 == 3)){
            System.out.println("It's a Draw!");}
        else
            System.out.println("You can only choose between 1, 2, and 3...");
    }
         
     if (pointComputer1 >= 2)
        System.out.println("\nYou LOST...");
    else if (pointPlayer1 >= 2)
        System.out.println("\nYou WON...");
   
}


}/*end class RPS.java*/

 
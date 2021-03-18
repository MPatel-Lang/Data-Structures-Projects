/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehul_4rdtk0d
 */


import java.util.Random;   
import java.util.Scanner;
public class testone
{

public static void main(String args[])
{
    int count_win=0;
    int user_choice;
    String choice=" ";
    int num_comp_wins=0;
    int num_user_wins=0;
    while(num_comp_wins!=2||num_user_wins!=2)
    {
    /* Read user input and determine choice */

    System.out.println("\n Let us play Rock Paper Scissors \n");
    System.out.println("\n Enter your choice 0 for rock, 1 for paper, or 2 for scissors \n");
    Scanner keyboard = new Scanner(System.in);
    user_choice=keyboard.nextInt();
    System.out.printf("\n Your choice was \n"+user_choice);
        switch (user_choice) {
            case 0:
                choice="rock";
                break;
            case 1:
                choice="paper";
                break;
            case 2:
                choice="scissor";
                break;
            default:
                System.out.println("Incorrect choice");
                choice=null;
                break;
        }
    System.out.println(choice);

    /* Randomly generate computer input */

    Random rand = new Random();
    int computer_choice = rand.nextInt(3) + 1;
    String choice1="";
        switch (computer_choice) {
            case 0:
                choice1="rock";
                break;
            case 1:
                choice1="paper";
                break;
            case 2:
                choice1="scissor";
                break;
            default:
                System.out.println("Incorrect choice");
                choice1=null;
                break;
        }
    System.out.println(choice1);
    
   /* Compare user and computer response*/
    if (choice.equalsIgnoreCase("rock")) {
    if (choice1.equalsIgnoreCase("scissor"))
    {
        System.out.println("\nThe user wins!");
        num_user_wins++;
    }
    else if (!choice1.equalsIgnoreCase("paper"))
        System.out.println("Tie");
    else {
        System.out.println("\nThe computer wins!");
        num_comp_wins++;
    }
}
else if (choice.equalsIgnoreCase("paper"))
{
    if (choice1.equalsIgnoreCase("scissor"))
    {
        System.out.println("\nThe computer wins!");
        num_comp_wins++;
    }
    else if (choice1.equalsIgnoreCase("rock"))
    {
        System.out.println("\nThe user wins!");
        num_user_wins++;
    }
    else
         System.out.println("Tie");
}
else if (choice.equalsIgnoreCase("scissor"))
{
    if (choice1.equalsIgnoreCase("rock"))
    {
        System.out.println("\nThe computer wins!");
        num_comp_wins++;
    }
    else if (choice1.equalsIgnoreCase("paper"))
    {
        System.out.println("\nThe user wins!");
        num_user_wins++;
    }
    else
         System.out.println("Tie");
}

}


}
}
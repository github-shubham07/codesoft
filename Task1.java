// *** random game code with java ***

import java.util.Scanner;

class Game {
    void playGame(){
        Scanner scan = new Scanner(System.in);
        //
        // user taking input
        System.out.print("Guess a number between 1 to 100 : ");
        // random number generating with math random function between 1 to 100;
        double randomNumber = Math.floor(Math.random() * 100) + 1;
        // declaring choice variable
        int choice = 10;
        // setting a limit
        int limit = 20;
        // declaring the points variable
        int points = 0;
        // declaring the for loop loop first 
        for (int i = 1; i < limit; i++){
            
            int user = scan.nextInt();
            // if else statement for compare the user
            if (user == randomNumber){
                System.out.println("Great you guessed the right number");
                int result = limit * 5;
                points += result;
                break;
            }
            else if (user > randomNumber){
                System.out.println("Too High! guess again");
            }
            else if (user < randomNumber){
                System.out.println("Too low! guess again!");
            }
            limit -= 1;
            choice -= 1;
            System.out.println(choice + " choices are left");
            System.out.print("guess again : ");
        } 
        System.out.println("\nYour points are : " + points);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner scan = new Scanner(System.in);
        // switch statement for user choice about game 
        while (true){
            System.out.print("Enter your choice : 1. Play Game 2. Play next Round 3. exit the Game : ");
        int user = scan.nextInt();
        switch(user){
            case 1:
                g.playGame();
                break;
            
            case 2:
                g.playGame();
                break;

            case 3:
                System.exit(0);
                break;

            default:
                break;
        }
        }
    }
}

// to compare i will use if else statement
// repeat two or three steps until user guess the number for that i will use for loop 
// limit the number of attempt to guess the numbers
// add the option for multiple rounds i will do that if else or switch statement
// display the user score for that i will simple math
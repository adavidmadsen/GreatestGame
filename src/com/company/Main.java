package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;
        String playerName;
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter your name:");
        playerName = userInput.nextLine();

        java.util.Random randomNumber = new java.util.Random();
        int n = randomNumber.nextInt(100) + 1;
        //System.out.println(n);

        System.out.println("Please enter a number between 1 and 100");
        int playerNumber = userInput.nextInt();

        while (playerNumber != n)
        {
            if (playerNumber < n)
            {
                System.out.println("Too low, please try again.");
                playerNumber = userInput.nextInt();
            }
            else if (playerNumber > n)
            {
                System.out.println("Too high, please try again.");
                playerNumber = userInput.nextInt();
            }
            count++;

            if (playerNumber == n)
            {
                System.out.println("You are correct. You Guessed " + count + " times.");
            }


        }


    }

}


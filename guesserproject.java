package com.company.Assign3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//1. Activity of guesser
class Guesser {
    //has part
    int guessNum;

    //do part
    int guessNum(){
        int min = 1;
        int max = 100;
        guessNum= (int)(Math.random()*(max-min+1)+min);
        return guessNum;
    }
}
//2. Activity of Player
class Player{
    //has part
    int guessNum;
    //do part
    int guessNum(){
        //asking player to guess number and store in variable

        Scanner p=new Scanner(System.in);
        guessNum=p.nextInt();
        return guessNum;
    }
}

//3. Activity of Umpire
class Umpire{
    //has part
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    //do part
    void collectNumFromGuesser(){
//		invoke values from guesser class by creating object
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum();
    }

    //	invoke values from Player class
    void collectNumFromPlayers() {
        System.out.print("Player 1 guess a number: ");
        Player p1=new Player();
        numFromPlayer1=p1.guessNum();

        System.out.print("Player 2 guess a number: ");
        Player p2=new Player();
        numFromPlayer2=p2.guessNum();

        System.out.print("Player 3 guess a number: ");
        Player p3=new Player();
        numFromPlayer3=p3.guessNum();
    }

    //Umpire compares Guesser vlaue with Players value
    void compare() {
        if(numFromGuesser==numFromPlayer1) {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
                System.out.println("All player won the match");
            }
            else if(numFromGuesser==numFromPlayer2) {
                System.out.println("Player 1 and 2 won the match");
            }
            else if(numFromGuesser==numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won match");
            }
            else {
                System.out.println("Player 1 Won the match");
            }
        }
        else if(numFromGuesser==numFromPlayer2) {

            if(numFromGuesser==numFromPlayer3) {
                System.out.println("Player 2 and Player 3 won the match");
            }
            else {
                System.out.println("Player 2 Won the match");
            }
        }
        else if(numFromGuesser==numFromPlayer3) {
            System.out.println("Player 3 Won the match");
        }
        else {
            System.out.println("game lost try again");
        }
    }


}
public class guesserproject {


    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Umpire u=new Umpire();
        Guesser ob = new Guesser();

        System.out.println("----Guess any number between 1 to 100----");
        //calling methods by umpire
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
        System.out.println("Number guessed by GUESSER was : " + ob.guessNum());


        Scanner in = new Scanner(System.in);


        boolean loop = true;
        while(loop)
        {
            System.out.print("Enter Play/Exit : ");
            String s = in.nextLine( ).trim();

            if(s.equals("Exit")|s.equals("exit"))
            {
                break;
            }
            else
            {
                //calling methods by umpire
                u.collectNumFromGuesser();
                u.collectNumFromPlayers();
                u.compare();
                System.out.println("Number guessed by GUESSER was : " + ob.guessNum());
            }
        }








    }

}

package com.programming;

import java.util.Scanner;

public class TicTacToeGame {
    private static Scanner scanner = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;
    static char[] board;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe game");
        createBoard();
        System.out.println("Choose a letter 'x' or 'o' :");
        char chosenLetter = scanner.next().charAt(0);
        chooseLetter(chosenLetter);
        showBoard(board);
    }

    /*  Empty board generation method
        Board array is created with 10 as the size of the array
        Board array assignment starts from 1 to 9 to avoid 0 entry
        Board value is assigned using a for loop with incrementing 'i' value
    */
    public static void createBoard() {
        board = new char[10];
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void chooseLetter(char chosenLetter) {
        if (chosenLetter == 'x') {
            playerLetter = 'x';
            System.out.println("Player letter is 'x' ");
            computerLetter = 'o';
            System.out.println("computer is assigned 'o' ");
        } else if (chosenLetter == 'o') {
            playerLetter = 'o';
            System.out.println("Player letter is 'o' ");
            computerLetter = 'x';
            System.out.println("computer is assigned 'x' ");
        } else
            System.out.println("Choose a valid letter");
    }

    public static void showBoard(char[] board) {
        for (int i = 0; i < board.length-1; i = ++i + 2) {
            System.out.println(board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
        }
    }
}



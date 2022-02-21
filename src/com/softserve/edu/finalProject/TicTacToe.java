package com.software.edu.finalProject;

import java.util.Scanner;

public class TicTacToe {
    public static final String EMPTY  = "   ";
    public static final String CROSS = " X ";
    public static final String TOE = " O ";

    public static final int ROWS = 3;
    public static  final int COLUMNS = 3;

    public static String[][] Grids = new String[ROWS][COLUMNS];

    public static  int statusGame;

    public static final int STATUS_GAME_CONT = 0;
    public static final int STATUS_GAME_DRAW = 1;
    public static final int STATUS_GAME_WINNER_X = 3;
    public static final int STATUS_GAME_WINNER_O = 4;

    public static String activesPlayer;

    public static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        StartGame();
        do {
            GetInput();
            Analysis();
            ShowsGrid();
            if(statusGame == STATUS_GAME_WINNER_X){
                System.out.println("'Х' переміг! Вітаємо!");
            }else if(statusGame == STATUS_GAME_WINNER_O){
                System.out.println("'O' переміг! Вітаємо!");
            }else if (statusGame == STATUS_GAME_DRAW){
                System.out.println("Гра закінчилася в нічію!");
            }

            activesPlayer = (activesPlayer == CROSS?TOE:CROSS);

        } while (statusGame == STATUS_GAME_CONT);

    }

    public static void StartGame(){
        for (int i = 0; i <ROWS ; i++) {
            for (int j = 0; j <COLUMNS ; j++) {
                Grids[i][j] = EMPTY;
            }
        }
        activesPlayer = CROSS;
        ShowsGrid();
    }

    public static void GetInput(){
        boolean inputTrue= false;
        do {
            System.out.print("Гравець "+activesPlayer +", введіть рядок(1 - 3) та стовпчик(1 - 3) через пробіл:  ");
            int row = sc.nextInt()-1;
            int column = sc.nextInt()-1;

            if(row>=0 && row<ROWS && column>=0 && column<COLUMNS && Grids[row][column]==EMPTY){
                Grids[row][column] = activesPlayer;
                inputTrue = true;
            }
            else {
                System.out.println("Вибране розміщення "+"("+(row+1)+", "+(column +1)
                        +")"+ " не може бути використаним. Спробуйте ще раз...");
            }
        }while (!inputTrue);

    }

    public static void Analysis(){
        String winner = FoundTheWinner();
        if(winner.equals(CROSS)){
            statusGame = STATUS_GAME_WINNER_X;
        }else if(winner.equals(TOE)){
            statusGame = STATUS_GAME_WINNER_O;
        }else  if(FullCells()){
            statusGame = STATUS_GAME_DRAW;
        }else {
            statusGame = STATUS_GAME_CONT;
        }
    }

    public static boolean FullCells(){
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if(Grids[i][j]==EMPTY){
                    return false;
                }
            }

        }
        return true;
    }

    public static String FoundTheWinner(){
        int countTheSame;

        for (int i = 0; i < ROWS; i++) {
            countTheSame = 0;
            for (int j = 0; j < COLUMNS; j++) {
                if (Grids[i][0] != EMPTY && Grids[i][0] == Grids[i][j]) {
                    countTheSame++;
                }
            }
            if (countTheSame == 3) {
                return Grids[i][0];
            }
        }

        for (int i = 0; i < COLUMNS; i++) {
            countTheSame = 0;
            for (int j = 0; j < ROWS; j++) {
                if (Grids[0][i] != CROSS && Grids[0][i] == Grids[j][i]) {
                    countTheSame++;
                }
            }
            if (countTheSame == 3) {
                return Grids[0][i];
            }
        }

        if(Grids[0][0]!=EMPTY && Grids[0][0] ==Grids[1][1] &&Grids[0][0] ==Grids[2][2]){
            return Grids[0][0];
        }

        if (Grids[0][2] != EMPTY && Grids[1][1] == Grids[0][2] && Grids[2][0] == Grids[0][2]) {
            return Grids[0][2];
        }

        return EMPTY;
    }

    public static void ShowsGrid() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(Grids[i][j]);
                if (j != COLUMNS - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != ROWS - 1) {
                System.out.println("-----------");
            }
        }
        System.out.println();

    }



}

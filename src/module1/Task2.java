package module1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите, как хотите походить в формате b1-c3");
        String currPos;
        String newPos;
        String move = keyboard.nextLine();
        currPos = move.split("-")[0].toLowerCase();
        newPos = move.split("-")[1].toLowerCase();
        if (isRightMove(currPos.charAt(0), Character.digit(currPos.charAt(1), 10),
                newPos.charAt(0), Character.digit(newPos.charAt(1), 10)))
            System.out.println("Ход верный");
        else System.out.println("Так конь не ходит!");
    }

    private static boolean isRightPositionOnBoard(char letter, int num) {
        return (letter < 'a' || letter > 'h') || (num < 1 || num > 8);
    }

    private static boolean isRightMove(char letCurrPos, int numCurrPos, char letNewPos, int numNewPos) {
        return (!isRightPositionOnBoard(letCurrPos, numCurrPos) ||
                !isRightPositionOnBoard(letNewPos, numNewPos)) &&
                Math.abs(letCurrPos - letNewPos) + Math.abs(numCurrPos - numNewPos) == 3;
    }
}

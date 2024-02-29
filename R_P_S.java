import java.util.Scanner;
public class R_P_S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            char moveOne, moveTwo;

            do {
                System.out.print("Player One, what is your move (R/P/S)? ");
                moveOne = in.next().toUpperCase().charAt(0);
            }
            while (moveOne != 'R' && moveOne != 'P' && moveOne != 'S');

            do {
                System.out.print("Player Two, what is your move (R/P/S)? ");
                moveTwo = in.next().toUpperCase().charAt(0);
            }
            while (moveTwo != 'R' && moveTwo != 'P' && moveTwo != 'S');

            System.out.println("Player One chose " + moveOne + ", Player Two chose " + moveTwo);
            System.out.println(determineWinner(moveOne, moveTwo));
            System.out.print("Do you want to play again? (Y/N): ");

            char playAgain = in.next().toUpperCase().charAt(0);
            if (playAgain != 'Y') {
                break;
            }
        }
        in.close();
    }
        public static String determineWinner(char moveOne, char moveTwo) {
            if (moveOne == moveTwo) {
                return "It's a Tie!";
            } else if ((moveOne == 'R' && moveTwo == 'S') ||
                    (moveOne == 'P' && moveTwo == 'R') ||
                    (moveOne == 'S' && moveTwo == 'P')) {
                return "Player One Wins!";
            } else {
                return "Player Two Wins!";
            }
        }
    }


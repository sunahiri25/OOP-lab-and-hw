import java.util.Scanner;

public class NumberGuess {
    static final int SECRET_NUMBER = (int) (Math.random() * 100);

    public static void main(String[] args) {
        guessingGame();
    }

    public static void guessingGame() {
        int guessNum = -1;
        int count = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Key in your guess: ");
        guessNum = in.nextInt();
        while (guessNum != SECRET_NUMBER) {
            if (guessNum > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
            guessNum = in.nextInt();
            count++;
        }
        in.close();
        System.out.printf("You got it in %d trials!", count);
    }


}

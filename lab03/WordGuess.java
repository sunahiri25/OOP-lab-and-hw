import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
//        final String SECRET_WORD = args[0];
        final String SECRET_WORD = randomChooseWord();
        guessWordGame(SECRET_WORD);
    }

    public static void guessWordGame(String SECRET_WORD) {
        String inStr;
        int count = 1;
        boolean[] arr = new boolean[SECRET_WORD.length()]; // to indicate the position of the word that have been guessed correctly

        Scanner in = new Scanner(System.in);
        System.out.print("Key in one character or your guess word: ");
        inStr = in.next();

        while (!inStr.equals(SECRET_WORD)) {
            System.out.printf("Trial %d: ", count);
            if (inStr.length() == 1) {
                for (int i = 0; i < SECRET_WORD.length(); i++) {
                    char ch = SECRET_WORD.charAt(i);
                    if (String.valueOf(ch).equals(inStr)) {
                        arr[i] = true; // update the boolean array
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]) {
                    System.out.print(SECRET_WORD.charAt(i));
                } else {
                    System.out.print("_");
                }
            }

            count++;
            System.out.print("\nKey in one character or your guess word: ");
            inStr = in.next();
        }
        in.close();
        System.out.println("Congratulation!");
        System.out.printf("You got in %d trials", count);
    }

    public static String randomChooseWord() {
        String word = "";
        String[] words = new String[500];
        try {
            int i = 0;
            Scanner sc = new Scanner(new File("C:\\Users\\minh anh\\Desktop\\homework_week03\\src\\words.txt"));
            while (sc.hasNextLine()) {
                words[i] = sc.next();
                i++;
            }
            sc.close();
            word = words[(int) (Math.random() * words.length)];
        } catch (FileNotFoundException e) {
            System.out.println("File is not found!");
        }
        return word;
    }
}

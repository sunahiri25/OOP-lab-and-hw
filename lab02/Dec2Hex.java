import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        // declare variables
        int inNum;
        StringBuilder outNum = new StringBuilder();
        // prompt and read the input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        inNum = in.nextInt();
        in.close();
        
        while (inNum > 0) {
            int temp = inNum % 16;
            if (temp <= 9) {
                outNum.insert(0, temp);
            } else {
                outNum.insert(0, (char) (temp + 55));
            }
            inNum /= 16;
        }
        System.out.println("The equivalent hexadecimal number is " + outNum);
    }
}

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner UserInput = new Scanner(System.in);
        String Name = UserInput.nextLine();
        char FirstLetter = Name.charAt(0);
        System.out.println("Hello, "+Name+" nice to meet you!");
        System.out.println(FirstLetter);
    }
}

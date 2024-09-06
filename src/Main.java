import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 101);
        System.out.println("you have 5 tries to guess the number i'm thinking of (between 1 and 100)");
        System.out.println("For reference purposes, the number is: " + randomNumber);

        int userGuess;
        System.out.println("guess a number between 1 and 100");
        userGuess = sc.nextInt();
        int numberGuesses = 4;

        for(int i = numberGuesses; i > 0; i--) {
            if (userGuess > 100 || userGuess < 1) {
                System.out.println("pls read the question again, " + i + " tries left");
                userGuess = sc.nextInt();
            }
            else if (userGuess < randomNumber){
                System.out.println("too small, " + i + " tries left");
                userGuess = sc.nextInt();
            }
            else if (userGuess > randomNumber) {
                System.out.println("too big " + i + " tries left");
                userGuess = sc.nextInt();
            }
            else {
                break;
            }
        }
        if(randomNumber != userGuess) {
            System.out.println("lol you lose, the number was " + randomNumber);
        }
        else {
            System.out.println("yeah u win :)");
        }

//        while(numberGuesses >= 0){
//    if (userGuess <= 100 && userGuess >= 0) {
//            if (userGuess < randomNumber && numberGuesses !=0) {
//                numberGuesses -= 1;
//                System.out.println("Your number is too small, you have " + numberGuesses + " tries left.");
//                userGuess = sc.nextInt();
//            } else if (userGuess > randomNumber && numberGuesses !=0) {
//                numberGuesses -= 1;
//                System.out.println("Your number is too big, you have " + numberGuesses + " tries left");
//                userGuess = sc.nextInt();
//            } else {
//                System.out.println("Congrats, you win!");
//                break;
//            }
//
//        }
//     else {
//
//        System.out.println("Invalid, please try again");
//    }}
//    if(numberGuesses == 0){
//        System.out.println("Sorry, the correct answer was: " + randomNumber + ". Better luck next time!");
//    }
    }
}
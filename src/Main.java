import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int maxRange = 500;
        int minRange = 100;
        int randomNumber = (int) (Math.random() * ((maxRange + 1) - minRange) + minRange);
        System.out.println("you have 5 tries to guess the number i'm thinking of between " + minRange + " and " + maxRange);
        System.out.println("For reference purposes, the number is: " + randomNumber);

        playGame(randomNumber, maxRange, minRange);
    }


    public static void playGame(int randomNumber, int maxRange, int minRange) {
        Scanner sc = new Scanner(System.in);
        int userGuess;
        System.out.println("guess a number between " + minRange + " and " + maxRange);
        userGuess = sc.nextInt();
        int numberGuesses = 4;

        for (int i = numberGuesses; i > 0; i--) {
            if (userGuess > maxRange || userGuess < minRange) {
                System.out.println("pls read the question again, " + i + " tries left");
                userGuess = sc.nextInt();
            } else if (userGuess < randomNumber) {
                System.out.println("too small, " + i + " tries left");
                userGuess = sc.nextInt();
            } else if (userGuess > randomNumber) {
                System.out.println("too big " + i + " tries left");
                userGuess = sc.nextInt();
            } else {
                break;
            }
        }
        if (randomNumber != userGuess) {
            System.out.println("lol you lose, the number was " + randomNumber);
        } else {
            System.out.println("yeah u win :)");
        }
    }
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


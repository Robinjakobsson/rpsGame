import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] rps = {"Rock", "Paper", "Scissors"};
        boolean isRunning = true; // Bool för while loopen för mer kontroll.
        int computerScore = 0; // Deklarerar och initierar 2 variabler för att hålla koll på poäng.
        int playerScore = 0;


        while (isRunning) {
            String computerMove = rps[new Random().nextInt(rps.length)];
            System.out.println("Computers score = " +computerScore);
            System.out.println("Players score = " + playerScore);
            System.out.println("--------------------");
            System.out.println("Choose your weapon!");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Random");
            System.out.println("5. Exit program.");
            Random random = new Random(4);
            int input = scanner.nextInt();

            if ((input < 1) || (input > 5)){  // ifall man inte kan läsa så hamnar man här
                System.out.println("Invalid option, try again.");
            }else;

            switch (input){
                case 1:
                    if (computerMove.equalsIgnoreCase("Paper")){
                        System.out.println("Enemy chose " + computerMove + ". You lose!");
                        computerScore++;

                    }else if (computerMove.equalsIgnoreCase("Rock")){
                        System.out.println("Enemy chose " + computerMove + ". Tie!");
                        computerScore++;
                        playerScore++;
                    }else{
                        System.out.println("Enemy chose " + computerMove + ". You win!");
                        playerScore++;
                    }

                    break;

                case 2:
                    if (computerMove.equalsIgnoreCase("Paper")){
                        System.out.println("Enemy chose " + computerMove + ". Tie!");
                        computerScore++;
                        playerScore++;
                    }else if (computerMove.equalsIgnoreCase("Rock")){
                        System.out.println("Enemy chose " + computerMove + ". You win!");
                        playerScore++;
                    }else {
                        System.out.println("Enemy chose " + computerMove + ". You lose!");
                        computerScore++;
                    }

                    break;

                case 3:
                    if (computerMove.equalsIgnoreCase("Paper")) {
                        System.out.println("Enemy chose " + computerMove + ". You win!");
                        playerScore++;
                    }else if (computerMove.equalsIgnoreCase("Rock")){
                        System.out.println("Enemy chose " + computerMove + ". You lose!");
                        computerScore++;
                    }else {
                        System.out.println("Enemy chose " + computerMove + ". Tie!");
                        computerScore++;
                        playerScore++;
                    }

                    break;


                case 4:
                    String playerMove;
                    playerMove = rps[new Random().nextInt(rps.length)];
                    System.out.println("You chose: " + playerMove);
                    System.out.println("Enemy chose: " + computerMove);
                    break;

                case 5:
                    System.out.println("Thanks for playing!");
                    isRunning = false;
                    break;




                }
            }
        }
    }

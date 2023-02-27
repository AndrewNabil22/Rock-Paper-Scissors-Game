import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        
        String answer = scan.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Great!");
            System.out.println("\nrock – paper – scissors, shoot!");

            String yourChoice = scan.next();
    
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("Darn, some other time...!");
        }


        scan.close();
    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int integer = (int)randomNumber;

        switch (integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }


public static String result(String yourChoice, String computerChoice) { 
    String result = "";
        if (yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) {
            result = "You win!!!! :D";
        }else if (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
            result = "You win!!! :D";
        }else if (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
            result = "You win!! :D";
        } else if(computerChoice.equalsIgnoreCase("rock") && yourChoice.equalsIgnoreCase("scissors")) {
            result = "You lose :$";
        } else if(computerChoice.equalsIgnoreCase("paper") && yourChoice.equalsIgnoreCase("rock")) {
            result = "You lose :(";
        } else if(computerChoice.equalsIgnoreCase("scissors") && yourChoice.equalsIgnoreCase("paper")) {
            result = "You lose :'(";
        } else if (yourChoice.equalsIgnoreCase(computerChoice)) {
            result = "It's a tie";
        }
        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\tYou chose: " + yourChoice);
        System.out.println("\tThe computer chose: " + computerChoice);
        System.out.println(result);
    }





}



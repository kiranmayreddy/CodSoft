import java.util.*;
class Numbergame {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to An Exciting Number Game");
        System.out.println("--------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("May i know your name? ");
        String name = scan.nextLine();
         int Total_attempts = 0;
         int win = 0;
         int loss=0;
         while(true){
        System.out.println("Let us Know the Specific Range of your Numbers");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the Maximum number of Range: ");
        int max_num = scan1.nextInt();
        System.out.println("Enter the Minimum number of Range: ");
        int min_num = scan1.nextInt();
        System.out.println("Well, "+name+", I am thinking of a number between "+max_num+ " and " +min_num); 
        int myNum = getRandomNumber(min_num,max_num);
        int attempts=0;
        System.out.println("Take a guess..Enter a guess number between "+max_num+" and "+min_num);
        for (int i=0;i <11; i++) {
            Scanner scan2 = new Scanner(System.in);
            int Guessnum = scan2.nextInt();
            attempts++;
            if (Guessnum == myNum) {
                System.out.println("Cool! your Guess is correct");
                System.out.println("");
                win++;
                break;
            }
            else if (Guessnum < myNum) {
                System.out.println("Guessed lower value!");
                System.out.println("");
            }
            else if (Guessnum > myNum) {
                System.out.println("Guessed higher value!");
                System.out.println("");
            }
            if (i>=10) {
                System.out.println("Sorry,you have reached maximum attempts,the correct guess should be "+myNum);
                System.out.println("");
                loss++;
            }
        }
             Total_attempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins upto this round = " + win);
            System.out.println("Loss upto this round = " + loss);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scan1.next();
            if(!playAgain.equalsIgnoreCase("yes")){
              System.out.println("-----------Final Score--------------"); 
           
              System.out.println("Overall Attempts = "+Total_attempts);
              System.out.println("Total played = "+(win+loss));
              System.out.println("Wins = " + win);
              System.out.println("Loss = " + loss);   
           
                scan1.close();
                System.exit(0);
            }
            scan1.nextLine();
      }  
    }
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random()*(max - min + 1) + min);
 }
}

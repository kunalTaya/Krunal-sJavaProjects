import java.util.Scanner;
import java.util.Random;
public class RockPaperSicssor {
    public static void main(String[] args) {

        String a=("""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""");


        String b = ("""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""");

        String c = ("""
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""");

        System.out.println("Rock, Paper and Siccsor Game in Java");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int s = rand.nextInt(3);
        System.out.println("Enter the 0 for Rock ,1 for paper and 2 for scissor");
        int user = sc.nextInt();
        System.out.println("Computer Choice");
        switch (s) {
            case (0): {
                System.out.println(a);
                break;
            }
            case (1): {
                System.out.println(b);
                break;

            }
            case (2): {

                System.out.println(c);
                break;
            }
          

        }
        
        System.out.println("User Choice");

        switch (user){
            case (0):{
                System.out.println(a);
                break;
            }
            case(1):{
                System.out.println(b);
                break;
            }
            case(2):{
                System.out.println(c);
                break;
            }
            default:{
                System.out.println("Enter the valid number ");
                break;
            }
        }
        if (user == s){
            System.out.println("It's Draw");
            
        } else if ((user == 0) && (s == 1)) {
            System.out.println("Computer Wins");

            
        } else if (user ==1 && s == 2) {
            System.out.println("Computer Wins");

        } else if (user == 2 && s == 0) {
            System.out.println("Computer Wins");


        } else if (s == 0 && user ==1) {
            System.out.println("User Wins");

        } else if (s == 1 && user ==2) {
            System.out.println("User wins");


        } else if (s == 2 && user == 0) {
            System.out.println("User Wins");

        }


    }
}
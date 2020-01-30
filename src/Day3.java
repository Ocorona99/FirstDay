import java.util.Random;
import java.util.Scanner;



public class Day3 {
    public static void main(String[] args){
        var randGenerator=new Random(); //this creates an object of the Random Class
        var number= randGenerator.nextInt(10)+1; // NextInt (10) will return 0..9
        System.out.println("Guess a number from 1 to 10");
        var reader = new Scanner (System.in);
        var user_guess=reader.nextInt();
        while(user_guess !=number){
            if (user_guess<number)
        System.out.println("Your guess is too low");
            else
                System.out.println("You guessed to high");
            System.out.print("Please guess again");
            user_guess=reader.nextInt();

        if (user_guess == number) // note lack of {
            System.out.print("You guessed " + number + " which is correct");
//        else
//            System.out.println(("You guessed" + user_guess+ " but my number was "+ number));

    }
}
    }

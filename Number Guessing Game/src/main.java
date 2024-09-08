
import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome To The Number Guessing Game");
        System.out.println("Choose a Level (Easy | Medium | Hard): ");
       
        String level = scanner.nextLine();
        
        if ("Easy".equals(level)) {
            int random_num = random.nextInt(11);
            System.out.println("Pick a number between 0 and 10 (inclusive): ");
            int predict = scanner.nextInt();
            if (predict == random_num) {
                System.out.println("You Won!");
            } 
            else {
                System.out.println("You Are Wrong. The correct number was " + random_num);
            }
        
        } 
        else if ("Medium".equals(level)) {
            int random_num = random.nextInt(51);
            System.out.println("Pick a number between 0 and 50 (inclusive): ");
            int predict = scanner.nextInt();
            if (predict == random_num) {
                System.out.println("You Won!");
            } 
            else {
                System.out.println("You Are Wrong. The correct number was " + random_num);
            }

        } 
        else if ("Hard".equals(level)) {
            int random_num = random.nextInt(101);
            System.out.println("Pick a number between 0 and 100 (inclusive): ");
            int predict = scanner.nextInt();
            if (predict == random_num) {
                System.out.println("You Won!");
            } 
            else {
                System.out.println("You Are Wrong. The correct number was " + random_num);
            }

        } 
        else {
            System.out.println("Invalid Level Selected. Please choose Easy, Medium, or Hard.");
        }
    }
}


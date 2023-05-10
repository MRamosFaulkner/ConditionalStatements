import java.util.Scanner;
public class TestScores {
    public void printTestScores(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100.");
        int num = scanner.nextInt();

        if(num >= 90) {
            System.out.println("You got an A!\n");
        }else if(num <= 89 && num >= 80) {
            System.out.println("You got a B!\n");
        }else if(num <= 79 && num >= 70) {
            System.out.println("You got a C!\n");
        }else if(num <= 69 && num >= 60) {
            System.out.println("You got a D!\n");
        }else {
            System.out.println("You got an F!\n");
        }
    }
}

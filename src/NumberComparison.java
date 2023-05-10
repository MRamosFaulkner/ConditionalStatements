import java.util.Scanner;
public class NumberComparison {
    public void printNumberComparison(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        if(num == num2) {
            //Prints this if it numbers are the same
            System.out.println("Same: Numbers are the same.\n");
        } else if (num > num2) {
            //Prints if first number is larger than second number
            System.out.println("Number one is larger than number two: The first number was larger than the second\n");
        } else {
            //Prints if second number is larger than first number
            System.out.println("Number two is larger than number one: The second number was larger than the first\n");
        }

    }

}
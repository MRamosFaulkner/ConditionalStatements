import java.util.Scanner;
public class BoilingWater {
        public void printBoilingWater(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number greater than 212.");
            int num = Integer.valueOf(scanner.nextLine());

            if(num >= 212) {
                System.out.println("Water is boiling!\n");
            }else {
                System.out.println("Water is not boiling!\n");
            }

        }

}

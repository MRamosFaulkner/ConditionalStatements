import java.util.Scanner;
public class SameOrNah {
    public void printSameOrNah(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a word: ");
        String word1 = String.valueOf(scanner.nextLine());

        System.out.println("Write another word: ");
        String word2 = String.valueOf(scanner.nextLine());

        if(word1 == word2) {
            System.out.println("The words are the same.\n");
        }else {
            System.out.println("The words are not the same.\n");
        }

    }

}

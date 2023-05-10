import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            BoilingWater boilingWater = new BoilingWater();
            NumberComparison numberComparison = new NumberComparison();
            TestScores testScores = new TestScores();
            SameOrNah sameOrNah = new SameOrNah();

            boilingWater.printBoilingWater();
            numberComparison.printNumberComparison();
            testScores.printTestScores();
            sameOrNah.printSameOrNah();

        }
    }
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1part1 {
    public static void main(String[] args) throws FileNotFoundException {

        //Read file
        File file = new File("day1/input.txt");
        Scanner sc = new Scanner(file);

        int calories = 0, maxCalories=0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.isEmpty()){
                if(calories> maxCalories) maxCalories = calories;
                calories = 0;
            }
            else
                calories += Integer.parseInt(line);
        }

        System.out.println(maxCalories);
    }
}

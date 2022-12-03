import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) throws FileNotFoundException {
        //Read file
        File file = new File("day1/input.txt");
        Scanner sc = new Scanner(file);

        List<Integer> caloriesList = new ArrayList<Integer>();
        int calories = 0, maxCalories=0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.isEmpty()){
                caloriesList.add(calories);
                calories = 0;
            }
            else
                calories += Integer.parseInt(line);
        }

        Collections.sort(caloriesList, Collections.reverseOrder());

        System.out.println(caloriesList.get(0) + caloriesList.get(1) + caloriesList.get(2));
    }
}

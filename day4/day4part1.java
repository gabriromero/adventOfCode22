package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class day4part1 {
    public static void main(String[] args) throws FileNotFoundException {

        //Read file
        File file = new File("day4/input.txt");
        Scanner sc = new Scanner(file);

        Integer sum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            
            List<Integer> first = makeList(parts[0].split("-"));
            List<Integer> second =  makeList(parts[1].split("-"));

            if(first.containsAll(second) || second.containsAll(first)) sum++;
        }

        System.out.println(sum);
    }
 
    private static List<Integer> makeList(String[] numbers) {
        List<Integer> numList = new ArrayList<>();
        for (int i = Integer.valueOf(numbers[0]); i <= Integer.valueOf(numbers[1]); i++) {
            numList.add(i);
        }
        return numList;
    }
}

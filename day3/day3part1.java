package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day3part1 {
    public static void main(String[] args) throws FileNotFoundException {
        
        //Read file
        File file = new File("day3/input.txt");
        Scanner sc = new Scanner(file);

        String line, firstHalf, secondHalf;
        char item;
        Integer sum = 0;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            firstHalf = line.substring(0,line.length()/2);
            secondHalf = line.substring(line.length()/2, line.length());
            item = findItem(firstHalf,secondHalf);
            sum += itemValue(item);
        }

        System.out.println(sum);

    }

    private static Integer itemValue(char item) {
        if (Character.isUpperCase(item)) return (int)item - 38;
        else return (int)item - 96;
    }

    private static char findItem(String firstHalf, String secondHalf) {

        for(int i = 0; i < firstHalf.length();i++){
            for(int j = 0; j < secondHalf.length();j++){
                if(firstHalf.charAt(i) == secondHalf.charAt(j))
                    return firstHalf.charAt(i);
            }
        }
        return 0;
    }
}

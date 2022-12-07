package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day3part2 {
    public static void main(String[] args) throws FileNotFoundException {
        
        //Read file
        File file = new File("day3/input.txt");
        Scanner sc = new Scanner(file);

        String line1, line2, line3;
        char item;
        Integer sum = 0;

        while (sc.hasNextLine()) {
            line1 = sc.nextLine();
            line2 = sc.nextLine();
            line3 = sc.nextLine();
            item = findItem(line1,line2,line3);
            sum += itemValue(item);
        }

        System.out.println(sum);

    }

    private static Integer itemValue(char item) {
        if (Character.isUpperCase(item)) return (int)item - 38;
        else return (int)item - 96;
    }

    private static char findItem(String line1, String line2, String line3) {

        for(int i = 0; i < line1.length();i++){
            for(int j = 0; j < line2.length();j++){
                if(line1.charAt(i) == line2.charAt(j)){
                    for(int l = 0; l < line3.length();l++){
                        if(line1.charAt(i) == line3.charAt(l)){
                            return line1.charAt(i);
                        }
                    }
                }
            }
        }
        return 0;
    }
}

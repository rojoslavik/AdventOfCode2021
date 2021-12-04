import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    ArrayList<String> inputs = new ArrayList<>();

    public Day2() {
        File file = new File("res/day2_input");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            inputs.add(scanner.nextLine());
        }
        scanner.close();
    }

    public void part1() {
        int forward = 0;
        int depth = 0;

        for (String input : inputs) {
            String[] splitted = input.split(" ");
            if (splitted[0].equals("forward")) {
                forward += Integer.parseInt(splitted[1]);
            } else if (splitted[0].equals("down")) {
                depth += Integer.parseInt(splitted[1]);
            } else if (splitted[0].equals("up")) {
                depth -= Integer.parseInt(splitted[1]);
            }

        }
        System.out.println(forward * depth);
    }

    public void part2() {
        int forward = 0;
        int depth = 0;
        int aim = 0;

        for (String input : inputs) {
            String[] splitted = input.split(" ");
            if (splitted[0].equals("forward")) {
                forward += Integer.parseInt(splitted[1]);
                depth += aim * Integer.parseInt(splitted[1]);
            } else if (splitted[0].equals("down")) {
                aim += Integer.parseInt(splitted[1]);
            } else if(splitted[0].equals("up")){
                aim -= Integer.parseInt(splitted[1]);
            }
        }
        System.out.println(depth * forward);
    }
}

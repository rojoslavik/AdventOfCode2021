import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    ArrayList<Integer> inputs = new ArrayList<>();

    public Day1() {
        File file = new File("res/day1_input");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            inputs.add(scanner.nextInt());
        }
        scanner.close();

    }

    public void part1() {
        int counter = 0;
        for (int i = 1; i < inputs.size(); i++) {
            if (inputs.get(i) > inputs.get(i - 1)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    void part2() {
        int counter = 0;
        int sum1 = inputs.get(0) + inputs.get(1) + inputs.get(2);

        for(int i = 1; i <= inputs.size() - 3; i++) {
            int sum2 = inputs.get(i) + inputs.get(i + 1) + inputs.get(i + 2);
            if(sum1 < sum2) {
                counter++;
            }
            sum1 = sum2;
        }
        System.out.println(counter);

    }

}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine();
        List<String> res = new ArrayList<>();

        while (!"0".equals(inp)) {
            try {
                res.add(String.valueOf(Integer.parseInt(inp) * 10));
            } catch (NumberFormatException e) {
                res.add("Invalid user input: " + inp);
            }

            inp = scanner.nextLine();
        }

        res.forEach(System.out::println);
    }
}

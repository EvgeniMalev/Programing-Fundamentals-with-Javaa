import java.util.*;

public class Main {

    public static void solve(List<Integer> series, Scanner scanner) {
        String command = scanner.nextLine();
        int startIndex, count;
        List<Integer> copy;

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            String action = commandArr[0];

            switch (action) {
                case "reverse":
                    startIndex = Integer.parseInt(commandArr[2]);
                    count = Integer.parseInt(commandArr[4]);

                    copy = new ArrayList<>(series.subList(0, series.size()));
                    List<Integer> reversed = new ArrayList<>(copy.subList(startIndex, startIndex + count));
                    Collections.reverse(reversed);

                    for (int i = 0; i < reversed.size(); i++) {
                        int el = reversed.get(i);
                        series.set(startIndex + i, el);
                    }

                    break;

                case "sort":
                    startIndex = Integer.parseInt(commandArr[2]);
                    count = Integer.parseInt(commandArr[4]);

                    copy = new ArrayList<>(series.subList(0, series.size()));
                    List<Integer> sorted = new ArrayList<>(copy.subList(startIndex, startIndex + count));
                    Collections.sort(sorted);

                    for (int j = 0; j < sorted.size(); j++) {
                        int el1 = sorted.get(j);
                        series.set(startIndex + j, el1);
                    }
                    break;

                case "remove":
                    count = Integer.parseInt(commandArr[1]);
                    series.subList(0, count).clear();
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", series.toString()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the series separated by commas:");
        String seriesInput = scanner.nextLine();
        List<Integer> series = new ArrayList<>();
        for (String num : seriesInput.split(", ")) {
            series.add(Integer.parseInt(num));
        }

        System.out.println("Enter commands ('end' to finish):");
        solve(series, scanner);
        scanner.close();
    }
}

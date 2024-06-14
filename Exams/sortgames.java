import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void solve(List<String> input) {
        List<String> games = Arrays.asList(input.get(0).split(", "));
        Map<String, Double> gameList = new HashMap<>();
        Map<String, Double> gameDLCList = new HashMap<>();

        for (String line : games) {
            if (line.contains("-")) {
                String[] parts = line.split("-");
                String game = parts[0];
                double price = Double.parseDouble(parts[1]);
                addGame(gameList, game, price);
            } else if (line.contains(":")) {
                String[] parts = line.split(":");
                String game = parts[0];
                String dlc = parts[1];
                addDLC(gameList, gameDLCList, game, dlc);
            }
        }

        sortGameDlc(gameDLCList);
        sortGames(gameList);
    }

    private static void addGame(Map<String, Double> gameList, String game, double price) {
        if (!gameList.containsKey(game)) {
            gameList.put(game, price);
        }
    }

    private static void addDLC(Map<String, Double> gameList, Map<String, Double> gameDLCList, String game, String dlc) {
        if (gameList.containsKey(game)) {
            String gameDLC = game + " - " + dlc;
            gameDLCList.put(gameDLC, gameList.get(game) * 1.2);
            gameList.remove(game);
        }
    }

    private static void sortGameDlc(Map<String, Double> gameDLCList) {
        List<Map.Entry<String, Double>> gameArray = new ArrayList<>(gameDLCList.entrySet());
        for (Map.Entry<String, Double> entry : gameArray) {
            entry.setValue(entry.getValue() * 0.5);
        }
        gameArray.sort(Comparator.comparingDouble(Map.Entry::getValue));
        printGames(gameArray);
    }

    private static void sortGames(Map<String, Double> gameList) {
        List<Map.Entry<String, Double>> gameArray = new ArrayList<>(gameList.entrySet());
        for (Map.Entry<String, Double> entry : gameArray) {
            entry.setValue(entry.getValue() * 0.8);
        }
        gameArray.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));
        printGames(gameArray);
    }

    private static void printGames(List<Map.Entry<String, Double>> array) {
        for (Map.Entry<String, Double> entry : array) {
            System.out.printf("%s - %.2f%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the games and DLCs separated by commas: ");
        String inputLine = scanner.nextLine();
        List<String> input = Collections.singletonList(inputLine);
        solve(input);
    }
}

/** An Java program that uses List and SubList structure
  The task is from 4th of November 2018 a JS Exam */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest {
    public static void quest(List<String> input) {
        List<String> journal = new ArrayList<>(List.of(input.get(0).split(", ")));
        List<String> array = new ArrayList<>(input.subList(1, input.size()));
        String line = array.remove(0);
        while (!line.equals("Retire!")) {
            String[] parts = line.split(" - ");
            switch (parts[0]) {
                case "Start":
                    start(parts[1], journal);
                    break;
                case "Complete":
                    complete(parts[1], journal);
                    break;
                case "Side Quest":
                    String[] quests = parts[1].split(":");
                    sideQuest(quests[0], quests[1], journal);
                    break;
                case "Renew":
                    renew(parts[1], journal);
                    break;
            }
            if (!array.isEmpty())
                line = array.remove(0);
            else
                break;
        }
        System.out.println(String.join(", ", journal));
    }

    private static void start(String quest, List<String> journal) {
        if (!journal.contains(quest)) {
            journal.add(quest);
        }
    }

    private static void complete(String quest, List<String> journal) {
        journal.remove(quest);
    }

    private static void sideQuest(String quest1, String quest2, List<String> journal) {
        int index = journal.indexOf(quest1);
        if (index != -1 && !journal.contains(quest2)) {
            journal.add(index + 1, quest2);
        }
    }

    private static void renew(String quest, List<String> journal) {
        journal.remove(quest);
        journal.add(quest);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Enter journal and actions (separated by comma and space):");
        String journalAndActions = scanner.nextLine();
        input.add(journalAndActions);
        String line;
        while (true) {
            System.out.println("Enter action (or 'Retire!' to finish):");
            line = scanner.nextLine();
            input.add(line);
            if (line.equals("Retire!"))
                break;
        }
        quest(input);
        scanner.close();
    }
}

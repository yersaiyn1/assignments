import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatGroup group1 = new ChatGroup("SE-2224");
        ChatGroup group2 = new ChatGroup("Boys");

        ChatUser user1 = new ChatUser("Assylzhan");
        ChatUser user2 = new ChatUser("Ali");
        ChatUser user3 = new ChatUser("Amina");
        ChatUser user4 = new ChatUser("Islambek");
        ChatUser user5 = new ChatUser("Kamilla");

        group1.addObserver(user1);
        group1.addObserver(user2);
        group1.addObserver(user3);
        group1.addObserver(user4);
        group1.addObserver(user5);

        group2.addObserver(user1);
        group2.addObserver(user2);
        group2.addObserver(user4);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a group:");
            System.out.println("1. SE-2224");
            System.out.println("2. Boys");
            System.out.print("Enter the number of the group (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            ChatGroup selectedGroup = null;

            if (input.equals("1")) {
                selectedGroup = group1;
            } else if (input.equals("2")) {
                selectedGroup = group2;
            }

            if (selectedGroup != null) {
                System.out.print("Enter a message: ");
                String message = scanner.nextLine();
                selectedGroup.sendMessage(message);
            } else {
                System.out.println("Invalid group number. Group not found.");
            }
        }

        scanner.close();
    }
}

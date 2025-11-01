package FolderManagement.view;

import FolderManagement.controller.FolderController;
import java.util.Scanner;

public class FolderView {
    private final FolderController manager;
    private final Scanner sc;

    public FolderView() {
        manager = FolderController.getInstance();
        sc = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n === Folder Management System ===");
            System.out.println("1. Create Folder");
            System.out.println("2. Create Item");
            System.out.println("3. List Contents");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Folder name: ");
                    manager.createFolder(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Item size (KB): ");
                    int size = sc.nextInt();
                    sc.nextLine();
                    manager.createItem(name, size);
                }
                case 3 -> manager.listContent();
                case 5 -> {
                    System.out.println("Exiting...!");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}
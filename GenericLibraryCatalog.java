import java.util.*;

// -------------------------------
// LibraryItem Class
// Represents a general library item.
// -------------------------------
class LibraryItem {
    private String title;
    private String author;
    private String itemID;

    // Constructor
    public LibraryItem(String title, String author, String itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getItemID() { return itemID; }

    // Returns a readable string representation of the item
    @Override
    public String toString() {
        return "ItemID: " + itemID + ", Title: " + title + ", Author: " + author;
    }
}

// -------------------------------
// GenericCatalog Class
// A generic class to manage various types of LibraryItem.
// -------------------------------
class GenericCatalog<T extends LibraryItem> {
    private Map<String, T> catalog;

    // Constructor initializes the catalog using a HashMap
    public GenericCatalog() {
        catalog = new HashMap<>();
    }

    // Adds a new item to the catalog
    public void addItem(T item) {
        catalog.put(item.getItemID(), item);
        System.out.println("Item added: " + item);
    }

    // Removes an item from the catalog by ID
    public void removeItem(String itemID) {
        if (catalog.containsKey(itemID)) {
            T removed = catalog.remove(itemID);
            System.out.println("Item removed: " + removed);
        } else {
            System.out.println("Error: Item with ID " + itemID + " not found.");
        }
    }

    // Displays all items in the catalog
    public void viewCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Catalog is empty.");
        } else {
            for (T item : catalog.values()) {
                System.out.println(item);
            }
        }
    }

    // Retrieves a single item by ID (optional)
    public T getItem(String itemID) {
        return catalog.get(itemID);
    }
    
}

// -------------------------------
// Main Class (User Interface)
// Provides command-line interaction with the user.
// -------------------------------
public class GenericLibraryCatalog {
    public static void main(String[] args) {
        // Create a catalog for LibraryItem
        GenericCatalog<LibraryItem> catalog = new GenericCatalog<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display menu until user chooses to exit
        do {
            System.out.println("\nLibrary Catalog Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline character

            switch (choice) {
                case 1:
                    // Add a new item
                    System.out.print("Enter item ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    LibraryItem newItem = new LibraryItem(title, author, id);
                    catalog.addItem(newItem);
                    break;

                case 2:
                    // Remove an item
                    System.out.print("Enter item ID to remove: ");
                    String removeId = scanner.nextLine();
                    catalog.removeItem(removeId);
                    break;

                case 3:
                    // View all items in the catalog
                    System.out.println("Catalog contents:");
                    catalog.viewCatalog();
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting catalog.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4); // Continue until user selects exit

        scanner.close();
    }
}

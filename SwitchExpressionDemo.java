public class SwitchExpressionDemo {
    public static void main(String[] args) {
        int itemId = 2;
        String itemDetails = switch (itemId) {
            case 1 -> "Basic Item";
            case 2 -> {
                System.out.println("Retrieving information for item 2...");
                String name = retrieveItemName(itemId);
                double price = calculatePrice(itemId);
                yield formatItemDetails(name, price);  // Yielding the result of a method call
            }
            case 3 -> {
                yield processSpecialItem();  // Directly yielding the result of a method
            }
            default -> "Unknown Item";
        };
        System.out.println(itemDetails);
    }

    // Supporting methods
    private static String retrieveItemName(int id) {
        return "Premium Widget";
    }

    private static double calculatePrice(int id) {
        return 29.99;
    }

    private static String formatItemDetails(String name, double price) {
        return name + " - $" + price;
    }

    private static String processSpecialItem() {
        // Complex logic for special items
        return "Special Item - Custom Configuration";
    }
}
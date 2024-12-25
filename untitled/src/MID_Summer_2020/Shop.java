package MID_Summer_2020;


public class Shop {
    public static void main(String[] args) {
        Item[] items = new Item[5];

        // Initialize the array with DiscountedItem objects
        items[0] = new DiscountedItem("Item 1", 100.0, 5);
        items[1] = new DiscountedItem("Item 2", 50.0, 10);
        items[2] = new DiscountedItem("Item 3", 200.0, 15);
        items[3] = new DiscountedItem("Item 4", 80.0, 8);
        items[4] = new DiscountedItem("Item 5", 120.0, 12);

        // Calculate the total sales value
        double totalSales = 0.0;
        for (Item item : items) {
            totalSales += item.getPrice();
        }

        System.out.println("Total sales value: " + totalSales);
    }
}

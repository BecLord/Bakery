import java.util.ArrayList;

public final class BakeryImp implements Bakery {
    private final ArrayList<Customer> customersList;
    private final ArrayList<Item> bakeryItemsList;
    private final int maxItemsPerOrder;
    private static int nextID = 1;

    // Constructor
    public BakeryImp(int maxItemsPerOrder) {
        this.maxItemsPerOrder = maxItemsPerOrder;
        this.customersList = new ArrayList<>();
        this.bakeryItemsList = new ArrayList<>();
    }

    // Add a cake item
    public int addCake(String name, String flavour, double price) {
        Item newItem = new Cake(nextID++, name, price, flavour);
        bakeryItemsList.add(newItem);
        return newItem.getId();
    }

    // Add a pastry item
    public int addPastry(String name, String filling, double price) {
        Item newItem = new Pastry(nextID++, name, price, filling);
        bakeryItemsList.add(newItem);
        return newItem.getId();
    }

    // Add a bread item
    public int addBread(String name, String type, double price) {
        Item newItem = new Bread(nextID++, name, price, type);
        bakeryItemsList.add(newItem);
        return newItem.getId();
    }

    // Remove an item
    public boolean removeItem(int itemID) {
        for (Item item : bakeryItemsList) {
            if (item.getId() == itemID) {
                bakeryItemsList.remove(item);
                return true;
            }
        }
        return false;
    }

    // Display item information
    public void displayItemInfo(int itemID) {
        for (Item item : bakeryItemsList) {
            if (item.getId() == itemID) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Display all item IDs
    public void displayAllItemIDs() {
        for (Item item : bakeryItemsList) {
            System.out.println("Item ID: " + item.getId());
        }
    }

    // Create an order
    public int createOrder(int customerID, int itemID, int quantity) {
        Customer customer = findCustomerById(customerID);
        if (customer == null) return -1; // Customer not found

        Item item = findItemById(itemID);
        if (item == null) return -2; // Item not found

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            items.add(item);
        }

        Order newOrder = new Order(nextID++, customerID, items);
        customer.placeOrder(newOrder);
        return newOrder.getOrderID();
    }

    // Display order information
    public void displayOrderInfo(int orderID) {
        for (Customer customer : customersList) {
            for (Order order : customer.getActiveOrders()) {
                if (order.getOrderID() == orderID) {
                    // Display order details
                    System.out.println("Order ID: " + order.getOrderID());
                    System.out.println("Customer ID: " + order.getCustomerID());
                    System.out.println("Items in Order:");
                    for (Item item : order.getItems()) {
                        System.out.println("- " + item.getName() + " (ID: " + item.getId() + ")");
                    }
                    return;
                }
            }
        }
        System.out.println("Order with ID " + orderID + " not found.");
    }

    // Remove an order
    public boolean removeOrder(int orderID) {
        for (Customer customer : customersList) {
            for (Order order : customer.getActiveOrders()) {
                if (order.getOrderID() == orderID) {
                    // Remove the order from the customer's active orders list
                    customer.getActiveOrders().remove(order);
                    System.out.println("Order with ID " + orderID + " has been removed.");
                    return true;  // Order removed successfully
                }
            }
        }
        System.out.println("Order with ID " + orderID + " not found.");
        return false; 
    }

    // Helper Methods
    private Customer findCustomerById(int customerID) {
        for (Customer customer : customersList) {
            if (customer.getId() == customerID) {
                return customer;
            }
        }
        return null;
    }

    private Item findItemById(int itemID) {
        for (Item item : bakeryItemsList) {
            if (item.getId() == itemID) {
                return item;
            }
        }
        return null;
    }
}

abstract class LibraryItem {
    int itemId;
    String itemName;
    private double price;
    // Constructor 
    LibraryItem(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        setPrice(price);
    }
    // Getter
    public double getPrice() {
        return price;
    }
    // Setter
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
            this.price = 0;
        }
    }
    // Display 
    public void display() {
        System.out.println("Item ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }
    // Abstract Method
    abstract void issueItem();
}


class Book extends LibraryItem {

    Book(int itemId, String itemName, double price) {
        super(itemId, itemName, price);
    }

    @Override
    void issueItem() {
        System.out.println(itemName + " Book Issued Successfully");
    }
}


class Magazine extends LibraryItem {

    Magazine(int itemId, String itemName, double price) {
        super(itemId, itemName, price);
    }

    @Override
    void issueItem() {
        System.out.println(itemName + " Magazine Issued Successfully");
    }
}


class Library {

    // Method Overloading

    void addItem() {
        System.out.println("No Item Details Provided");
    }
    void addItem(int itemId, String itemName) {
        System.out.println("Item Added");
        System.out.println("Item ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
    }
    void addItem(int itemId, String itemName, double price) {
        System.out.println("Item Added");
        System.out.println("Item ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }
}


public class LibraryManagement {

    public static void main(String[] args) {

        Library library = new Library();
        library.addItem();
        library.addItem(101, "Java Programming");
        library.addItem(101, "Java Programming", 750);
        System.out.println("-----Library Items------");
        
        LibraryItem item;
        item = new Book(101, "Java Programming", 750);
        item.display();
        item.issueItem();
        System.out.println("--------------------------------");
        item = new Magazine(201, "Tech Monthly", 150);
        item.display();
        item.issueItem();



    }
}
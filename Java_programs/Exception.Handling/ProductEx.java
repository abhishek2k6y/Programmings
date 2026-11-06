class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductEx {
    public static void main(String[] args) {
        try {
            Product p = new Product("Laptop", -500);
            p.display();
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

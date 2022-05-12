public class Item {
    // Member Variables
    private String name;
    private double price;
    // Constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
// Getters and Setters
    public String getItemName(){
        return "The name of the item is" + name;
    }
    public void setItemName(String itemName){
        this.name = itemName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double itemPrice){
        this.price = itemPrice;
    }
}

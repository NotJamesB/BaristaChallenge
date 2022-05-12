import java.util.ArrayList;
public class Orders {

    // Member Variables
    private String name;
    double total;
    private boolean ready;
    private ArrayList<Item> item = new ArrayList<Item>();
    // Constructor
    public Orders(){
    this.name = "Guest";
    this.item = new ArrayList<Item>();
    }
    public Orders(String name){
        this.name = name;
        this.item = new ArrayList<Item>();
    }
    // Order Methods
    public void addItem(Item item){
        this.item.add(item);
    }
    public void display(){
        System.out.println("Customer name: " + this.name);
        for(Item i: this.item){
            System.out.println((i.getItemName() + " - " + i.getPrice()));
        }
        System.out.println("Total: "+ getOrderTotal());
    }
    // Getters and setters
    public String getOrderName(){
        return "Order name: " + name;
    }
    public void setOrderName(String orderName){
        this.name = orderName;
    }
    public double getOrderTotal() {
        double sum = 0;
        for(Item i: this.item){
            sum += i.getPrice();
        }
        return sum;
    }
    public void setOrderTotal(double orderTotal){
        total = orderTotal;
    }
    public String getIsReadyStatus(){
        
        if(this.ready == true){
            return "Your order is ready!";
        }
        else{
            return "Thank you for waiting. Your Order will be ready soon.";
            }
        }
    public void setReadyStatus(boolean b) {
    }
    }


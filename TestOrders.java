public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 1.25;
        Item item2 = new Item();
        item2.price = 2.00;
        item2.name = "Latte";
        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 1.50;
        Item item4 = new Item();
        item4.name ="capuccino";
        item4.price = 1.75;
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        order1.name = "Cindhuri";
        order1.ready = true;
        Orders order2 = new Orders();
        order2.name ="Jimmy";
        order2.ready = true;
        order2.item.add(item1);
        order2.total = item1.price;
        Orders order3 = new Orders();
        order3.item.add(item4);
        order3.total = item4.price;
        order3.name = "Noah";
        Orders order4 = new Orders();
        order4.name ="Sam";
        order4.item.add(item2);
        order4.item.add(item2);
        order4.total = item2.price;
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}


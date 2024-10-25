public class Datatypes {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        // Variables
        String name = "John";
        System.out.println("1) String : " + name);

        int myNum = 15;
        System.out.println("2) int : " + myNum);

        // real-life example
        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}

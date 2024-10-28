public class Mathmethod {
    public static void main(String[] args) throws Exception {
    
        System.out.println(Math.max(5, 10)); //highest value of x and y
        System.out.println(Math.min(5, 10)); //lowest value of x and y
        System.out.println(Math.sqrt(64)); //square root of x
        System.out.println(Math.abs(-4.7)); //absolute (positive) value of x
        System.out.println(Math.random()); //random number between 0.0 (inclusive), and 1.0 (exclusive)

        System.out.println("Example for Random Number");
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

    }
}

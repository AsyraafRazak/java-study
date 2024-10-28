public class Booleans {

    public static void main(String[] args) throws Exception {
        
        // Boolean is a data type to store true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // can use comparison operator,
        System.out.println(">, ==, >=, <=");

        System.out.println("example");

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9
        System.out.println(x == 10); // returns true, because the value of x is equal to 10v
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
          } else {
            System.out.println("Not old enough to vote.");
          }
    }
}

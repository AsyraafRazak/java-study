public class TypeCasting {
    public static void main(String[] args) throws Exception {
        System.out.println("1) Widening Casting");
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble + "\n");   // Outputs 9.0

        System.out.println("2) Narrowing Casting");
        myDouble = 9.78d;
        myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
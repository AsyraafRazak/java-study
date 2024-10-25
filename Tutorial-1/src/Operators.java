public class Operators {
    public static void main(String[] args) throws Exception {
        //Operators
        int x = 5;
        int y = 3;

        System.out.println("1) Arithmetic Operatos");
        System.out.println("--> +, -, $, /, %, ++, --");
        System.out.println(x + y);

        System.out.println("2) Assignment Operatos");
        System.out.println("--> =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=");
        x += 3;
        System.out.println(x);

        System.out.println("3) Comparison Operatos");
        System.out.println("--> ==, !=, >, <, >=, <=");
        System.out.println(x == y); // returns false because 5 is not equal to 3

        System.out.println("4) Logical Operatos");
        System.out.println("&&, ||, !");
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
    }
}

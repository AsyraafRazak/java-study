public class Strings {
    public static void main(String[] args) throws Exception {
        System.out.println("1) length() method");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println("2) toUpperCase() and toLowerCase()");
        txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        System.out.println("3) indexOf() to find a character by return the index (the position)");
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7 

        System.out.println("4) concat()");
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println("Guna concat() : " + firstName.concat(lastName)); //atau
        System.out.println("Guna + : " + firstName + " " + lastName);

        System.out.println("Will concate if add number and a string");
        String x = "10";
        int y = 20;
        
        System.out.println(x + y); //will be 1020 (a String)

        // String special character
        // \' , \" , \\ 
        // \n (new line), \r (Carriage Return), \t (Tab), \b (Bacjspace), \f (Form Feed)
    }
}

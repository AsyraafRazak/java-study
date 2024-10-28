public class Loop {
    public static void main(String[] args) throws Exception {

        System.out.println("1) While Loop");
        int i = 0;
        while (i < 5) {
          System.out.print(i + " ");
          i++;
        }

        System.out.println("\n" + "2) Do/While Loop");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i < 5);

        System.out.println("\n" + "3) For Loop");
        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.
        for (i = 0; i < 5; i++) {
            System.out.print(i + " ");
          }

        System.out.println("\n" + "4) Nested Loop");
        //The "inner loop" will be executed one time for each iteration of the "outer loop"
        // Outer loop
        for (i = 1; i <= 2; i++) {
            System.out.print("Outer: " + i + " -> "); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.print("Inner: " + j + ", "); // Executes 6 times (2 * 3)
            }
            System.out.println();
        } 

        System.out.println("5) For-Each Loop");
        // Loop through elements in an array 

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String j : cars) {
        System.out.print(j + " ");
        }
    }
}

public class ConditionsIf {

    public static void main(String[] args) throws Exception {
        System.out.println("Condition statement in Java");
        
        System.out.println("1) if");
        if (20 > 18) {
            System.out.println("20 is greater than 18");
          }

        System.out.println("2) else");
        int time = 20;
        if (time < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        System.out.println("3) else if");
        int time1 = 22;
        if (time1 < 10) {
          System.out.println("Good morning.");
        } else if (time1 < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        System.out.println("Bonus : Short Hand If ... Else (Ternary Operator)");
        // instead of 
        int time2 = 20;
        if (time2 < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }

        // write
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        System.out.println("4) switch");
        // The value of the expression is compared with the values of each case
        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
        // Outputs "Thursday" (day 4)

        System.out.println("When Java reaches a break keyword, it breaks out of the switch block.");
        System.out.println("The default keyword specifies some code to run if there is no case match");
        
        switch (day) {
          case 6:
            System.out.println("Today is Saturday");
            break;
          case 7:
            System.out.println("Today is Sunday");
            break;
          default:
            System.out.println("Looking forward to the Weekend");
        }
        // Outputs "Looking forward to the Weekend"
    }
}

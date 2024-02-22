package Function;

import java.util.Scanner;

public class DigitFrequency {
    // ques if 9 9 3 4 6 9 2 8 how many times 9 appear--->3times
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.err.println(f);
        scn.close();

    }

    public static int getDigitFrequency(int n, int d) {
        int rv = 0;
        while (n > 0) {
            int dig = n % 10;
            if (dig == d) {
                rv++;
            }

        }
        return rv;

    }
}
/*
 * Sure, let's go through the code step by step and explain its functionality:
 * 
 * The code defines a Java class named DigitFrequency within the package
 * Function.
 * 
 * It imports the necessary package java.util.Scanner to allow user input.
 * 
 * The main method is the entry point of the program, where the execution
 * begins.
 * 
 * Inside the main method:
 * a. It creates a new Scanner object named scn to read input from the standard
 * input (keyboard).
 * b. It prompts the user to enter two integer values: n and d.
 * c. It calls the getDigitFrequency method and passes the values of n and d to
 * it.
 * d. It stores the result returned by the getDigitFrequency method in an
 * integer variable f.
 * e. Finally, it prints the value of f using System.err.println(f). Note: It
 * uses System.err.println instead of System.out.println, but it should work the
 * same way.
 * 
 * The getDigitFrequency method takes two integer parameters, n and d, and
 * returns an integer.
 * 
 * Inside the getDigitFrequency method:
 * a. It initializes an integer variable rv (short for "result value") to 0.
 * This variable will store the count of occurrences of digit d in the number n.
 * b. It enters a while loop, which will continue as long as the value of n is
 * greater than 0.
 * c. Within the loop, it extracts the last digit of the number n using the
 * expression n % 10 and stores it in the variable dig.
 * d. It then checks if the value of dig is equal to the given digit d. If it
 * is, it increments the count stored in rv by 1.
 * e. After processing the last digit of n, it moves to the next digit by
 * dividing n by 10 (n = n / 10), effectively removing the last digit.
 * f. The loop continues until all the digits in n have been processed.
 * g. Finally, once the loop exits, the method returns the count stored in rv,
 * representing the number of occurrences of digit d in the original number n.
 * 
 * The corrected code ensures that the getDigitFrequency method correctly counts
 * all occurrences of the digit d in the number n.
 * 
 * Example:
 * Suppose we take the following input:
 * 
 * makefile
 * Copy code
 * n = 99346928
 * d = 9
 * Let's go through the steps of the getDigitFrequency method with this input:
 * 
 * rv is initialized to 0.
 * Loop starts:
 * n % 10 gives us the last digit of n, which is 8. Since 8 is not equal to 9
 * (our digit d), rv remains 0.
 * n is updated to n / 10, which is 9934692, effectively removing the last digit
 * (8).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 2. Since 2 is not equal to 9
 * (our digit d), rv remains 0.
 * n is updated to n / 10, which is 993469, effectively removing the last digit
 * (2).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 9. Since 9 is equal to 9 (our
 * digit d), rv is incremented to 1.
 * n is updated to n / 10, which is 99346, effectively removing the last digit
 * (9).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 6. Since 6 is not equal to 9
 * (our digit d), rv remains 1.
 * n is updated to n / 10, which is 9934, effectively removing the last digit
 * (6).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 4. Since 4 is not equal to 9
 * (our digit d), rv remains 1.
 * n is updated to n / 10, which is 993, effectively removing the last digit
 * (4).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 3. Since 3 is not equal to 9
 * (our digit d), rv remains 1.
 * n is updated to n / 10, which is 99, effectively removing the last digit (3).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 9. Since 9 is equal to 9 (our
 * digit d), rv is incremented to 2.
 * n is updated to n / 10, which is 9, effectively removing the last digit (9).
 * Loop continues:
 * n % 10 gives us the last digit of n, which is 9. Since 9 is equal to 9 (our
 * digit d), rv is incremented to 3.
 * n is updated to n / 10, which is 0. The loop exits as n is no longer greater
 * than 0.
 * The method returns the value of rv, which is 3.
 * Therefore, the output of the program will be 3, as it correctly counts the
 * occurrences of digit 9 in the number 99346928.
 */
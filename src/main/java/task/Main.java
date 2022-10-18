package task;

import java.util.Scanner;


public class Main implements Runnable {

    public void run() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a n Value for function \nun = (1 / n!) * (1! + 2! + 3! + ... + n!): ");

        try {
            double num = input.nextDouble();

            while (num < 0) {
                System.out.println("Your input must be non-negative. Please enter a positive number: ");
                num = input.nextDouble();
            }
            System.out.println((1 / MathFunction.factorial(num)) * MathFunction.cycleSum(num));
        } catch (Exception e) {
            System.out.println("Error: You did not enter an integer. Program has terminated.");
        }
        input.close();
    }
}

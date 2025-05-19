package practice_problem_03;

import java.util.*;

public class p1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;
        System.out.println("The average is: " + average);
    }
}

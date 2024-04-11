package Com.MetricAditionDemo;

import java.util.Scanner;

public class AverageGradeCalc {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("How many subjects do you have? ");
      int numSubjects = scanner.nextInt();

      int[] scores = new int[numSubjects];
      for (int i = 0; i < numSubjects; i++) {
          System.out.print("Enter the score for subject " + (i + 1) + ": ");
          scores[i] = scanner.nextInt();
      }

      double sum = 0;
      for (int score : scores) {
          sum += score;
      }

      double average = sum / numSubjects;
      System.out.printf("Average grade: %.2f%n", average);
  }
}

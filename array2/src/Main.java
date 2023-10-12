import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        float[][] marks = new float[3][3];
        char[] grades = new char[3];
        char[] results = new char[3];
        float average=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            float sum = 0;


            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextFloat();
                scanner.nextLine();
                sum += marks[i][j];
            }

            average = sum / 3;

            if (average >= 70 && average <= 100) {
                grades[i] = 'A';
                results[i] = 'P';
            } else if (average >= 50 && average < 70) {
                grades[i] = 'B';
                results[i] = 'P';
            } else {
                grades[i] = 'C';
                results[i] = 'F';
            }
        }

        System.out.println("*****************************************************************");
        System.out.println("\t\t\t\t\tSTUDENTS MARKLIST\t\t");
        System.out.println("*****************************************************************");
        System.out.println("Name\tmark1\tmark2\tmark3\tTotal\tResult\tAverage\tGrade");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + (marks[i][0] + marks[i][1] + marks[i][2]) + "\t" + results[i] + "\t" + average + "\t" + grades[i]);
        }

        scanner.close();
    }
}

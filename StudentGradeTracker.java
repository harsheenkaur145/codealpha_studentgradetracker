import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("=== Student Grade Tracker ===");
        System.out.println("Marks daalo (0-100). Rukne ke liye -1 daalo.");

        while (true) {
            System.out.print("Mark daalo: ");
            int mark = sc.nextInt();
            if (mark == -1) {
                break;
            }
            if (mark < 0 || mark > 100) {
                System.out.println("Galat mark! 0-100 ke beech daalo.");
                continue;
            }
            grades.add(mark);
        }

        if (grades.isEmpty()) {
            System.out.println("Tune koi mark nahi dala!");
            sc.close();
            return;
        }

        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int g : grades) {
            sum += g;
            if (g > highest) highest = g;
            if (g < lowest) lowest = g;
        }

        double average = (double) sum / grades.size();

        System.out.println("\n----- Result -----");
        System.out.println("Total Students: " + grades.size());
        System.out.println("Saare Marks: " + grades);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        sc.close();
    }
}

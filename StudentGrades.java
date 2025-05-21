import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        String input;

        // Input grades
		
        System.out.println("Enter student grades (type 'done' to finish):");
        while (true) 
		{
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) 
			{
                break;
            }
            try 
			{
                double grade = Double.parseDouble(input);
                grades.add(grade);
            } catch (NumberFormatException e) 
			{
                System.out.println("Please enter a valid number or 'done' to finish.");
            }
        }

        // Calculate average, highest, and lowest scores
		
        if (grades.size() > 0) 
		{
            double sum = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);

            for (double grade : grades) 
			{
                sum += grade;
                if (grade > highest) 
				{
                    highest = grade;
                }
                if (grade < lowest) 
				{
                    lowest = grade;
                }
            }

            double average = sum / grades.size();

            // Display results
			
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Highest score: %.2f%n", highest);
            System.out.printf("Lowest score: %.2f%n", lowest);
        }
		else 
		{
            System.out.println("No grades were entered.");
        }
        scanner.close();
    }
}
package studentmanagementsystem;


import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.println("Details of UnderGraduate Student");

            System.out.println("Enter the Student ID :");
            int Id = input.nextInt();

            input.nextLine();
            System.out.println("Enter the Student name :");
            String name = input.nextLine();

            System.out.println("Enter the total marks :");
            double marks = input.nextDouble();

            System.out.println("Enter the Credit Hours :");
            int hours = input.nextInt();

            Student s1 = new UnderGraduatestudent(Id,name,marks,hours);

            System.out.println();

            System.out.println("Details of Graduate Student");

            System.out.println("Enter the Student Id :");
            int Id1 = input.nextInt();

            input.nextLine();
            System.out.println("Enter the Student name :");
            String name1 = input.nextLine();

            System.out.println("Enter the total marks :");
            double marks1 = input.nextDouble();

            System.out.println("Enter the Research Score :");
            int score = input.nextInt();

            Student s2 = new GraduateStudent(Id1,name1,marks1,score);

            ArrayList <Student> students = new ArrayList<>();
            students.add(s1);
            students.add(s2);

            for(Student s : students)
            {
                System.out.println();
                s.displaydetails();
                System.out.println("Grade :" + s.calculateGrade());

                if(s instanceof scholarship)
                {
                    scholarship sp = (scholarship) s;
                    System.out.println("Scholarship Amount :" + sp.calculatedScholarshipamount());
                }
            }
        }

        catch (InvalidMarksException e)
        {
            System.out.println("Exception : "+e.getMessage());
        }

        finally
        {
            System.out.println("Program is terminated");
        }
    }

}
